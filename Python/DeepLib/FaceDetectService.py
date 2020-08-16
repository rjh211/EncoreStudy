from cv2 import cv2
import copy, os
import numpy as np

class FaceDetecService:
    def __init__(self, src, filepath):
        self.filepath = filepath
        self.classifier = []
        self.src = src
        self.image = None
        self.gray = None
        self.res = None
        self.dataset_path = 'Encore/temp/DataSet/'
        self.trainer = 'trainer.yml'

    def face_detect(self):
        self.classifier.clear()
        self.classifier.append(cv2.CascadeClassifier(self.filepath))
        self.img = cv2.imread(self.src)
        self.gray = cv2.cvtColor(self.img, cv2.COLOR_BGR2GRAY)

        self.face = self.classifier[0].detectMultiScale(
            self.gray,
            scaleFactor=1.2,
            minNeighbors=5,
            minSize=(20, 20)
        )

        img = copy.deepcopy(self.img)
        for (x,y,w,h) in self.face:
            cv2.rectangle(img, (x,y), (x+w, y+h),(255,0,0),2)
            self.res = img
        if len(self.face)  == 0:
            print('no face')
            return False
        return True

    def eye_detect(self):
        flag = self.face_detect()
        if not flag:
            print('no face, no eyes')
            return False
        self.classifier.append(cv2.CascadeClassifier('Encore\\temp\\Classifier\\haarcascade_eye.xml'))
        img= copy.deepcopy(self.img)
        for(x,y,w,h) in self.face:
            roi_gray = self.gray[y:y+h, x:x+w]
            roi_color = img[y:y+h, x:x+w]
        eyes = self.classifier[1].detectMultiScale(roi_gray, scaleFactor = 1.2, minNeighbors = 5, minSize=(20,20))
        for (x,y,w,h) in eyes:
            cv2.rectangle(roi_color, (x,y), (x+w, y+h), (0,255,0), 2)
            self.res = img
        return True

    def smile_detect(self):
        flag = self.face_detect()
        if not flag:
            print('no face, no eyes')
            return False
        self.classifier.append(cv2.CascadeClassifier('Encore\\temp\\Classifier\\haarcascade_eye.xml'))
        img= copy.deepcopy(self.img)
        for(x,y,w,h) in self.face:
            roi_gray = self.gray[y:y+h, x:x+w]
            roi_color = img[y:y+h, x:x+w]
        eyes = self.classifier[1].detectMultiScale(roi_gray, scaleFactor = 1.2, minNeighbors = 5, minSize=(20,20))
        for (x,y,w,h) in eyes:
            cv2.rectangle(roi_color, (x,y), (x+w, y+h), (0,0,255), 2)
            self.res = img
        return True

    def FaceRecogTrain(self):
        dirs = os.listdir(self.dataset_path)#dataset 하위 디렉토리 이름을 리스트에 저장
        persons = []
        for dir in dirs: #각 디렉토리에 저장된 파일명들을 persons에 담음
            if os.path.isdir(self.dataset_path+dir):
                persons.append(os.listdir(self.dataset_path+dir))

        self.classifier.clear()
        self.classifier.append(cv2.CascadeClassifier('Encore/temp/Classifier/haarcascade_frontalface_default.xml'))

        recognizer = cv2.face.LBPHFaceRecognizer_create()
        samples = []
        ids = []
        #학습할 얼굴 샘플링
        for id, row in enumerate(persons):
            for p in row:
                img = cv2.imread(self.dataset_path+dirs[id]+'/'+p)
                #print(self.dataset_path+dirs[id]+'/'+p)
                self.gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
                self.face = self.classifier[0].detectMultiScale(
                    self.gray,
                    scaleFactor=1.2,
                    minNeighbors=5,
                    minSize=(20, 20)
                )
                for (x,y,w,h) in self.face:
                    samples.append(self.gray[y:y+h, x:x+w])
                    ids.append(id)

        recognizer.train(samples, np.array(ids))
        recognizer.write(self.dataset_path+self.trainer)
        print('얼굴 학습 완료')
    def faceRecogTest(self):
        self.classifier.clear()
        self.classifier.append(cv2.CascadeClassifier('Encore/temp/Classifier/haarcascade_frontalface_default.xml'))

        recognizer = cv2.face.LBPHFaceRecognizer_create()
        recognizer.read(self.dataset_path+self.trainer)

        names=['남자', '여자']
        self.img = cv2.imread(self.src)
        self.gray = cv2.cvtColor(self.img, cv2.COLOR_BGR2GRAY)
        self.face = self.classifier[0].detectMultiScale(
            self.gray,
            scaleFactor=1.2,
            minNeighbors=5,
            minSize=(20, 20)
        )
        res = False
        name = 'no face'
        for (x, y, w, h) in self.face:
            id, confi = recognizer.predict(self.gray[y:y+h, x:x+w])
            if confi < 100:
                name = names[id]
                print(name,'/ confidence:', confi)
                res = True
            else:
                name = 'unknown'
                res = False

        return res, name

