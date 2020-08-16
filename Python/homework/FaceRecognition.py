from cv2 import cv2
import sys

image_file = 'C:\\Users\\JH\\Desktop\\playdata\\Python_encore\\Encore\\homework\\Image\\4.PNG'
cascade_file = 'C:\\Users\\JH\\Downloads\\opencv-master\\data\\haarcascades\\haarcascade_frontalface_alt2.XML'


image = cv2.imread(image_file)
def isFace(image , cascade_file = 'C:\\Users\\JH\\Downloads\\opencv-master\\data\\haarcascades\\haarcascade_frontalface_alt2.XML'):
    cascade = cv2.CascadeClassifier(cascade_file)

    image_gs = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
    face_list = cascade.detectMultiScale(image_gs, scaleFactor=1.1, minNeighbors=1,minSize=(150,150))
    if len(face_list) > 0:
        color = (0,0,255)
        for face in face_list:
            x,y,w,h = face
            cv2.circle(image,((x+int(w/2)),y),15,color, thickness=-1)
            cv2.rectangle(image,(x,y),(w+x,h+y), color, thickness=8)
            cv2.imshow('test',image)
            cv2.imwrite('C:\\Users\\JH\\Desktop\\playdata\\Python_encore\\Encore\\homework\\Image\\test.PNG',image)
            cv2.waitKey(0)
            return True
    return False