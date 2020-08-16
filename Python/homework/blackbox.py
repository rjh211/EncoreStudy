from cv2 import cv2
import tkinter as tk
import os , datetime
from PIL import Image, ImageTk
import threading

from FaceRecognition import isFace

CaptureMode = False
ShowListBox = False

def ChangeMode() : 
    global CaptureMode
    CaptureMode = False if CaptureMode == True else True
    streamTread = threading.Thread(target=VideoStream, args=())
    CaptureTread = threading.Thread(target=writeVideo, args=())
    if CaptureMode : 
        streamTread._stop()
        CaptureTread.start()
    else : 
        CaptureTread._stop()
        streamTread.start()

def getImageList():
    return os.listdir('C:\\Users\\JH\\Desktop\\playdata\\Python_encore\\Encore\\homework\\Image')

def getVideoList():
    return os.listdir('C:\\Users\\JH\\Desktop\\playdata\\Python_encore\\Encore\\homework\\Video')
def convert2TKImage(cvImage):
    image = cv2.resize(cvImage, (320, 200))
    image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)
    return ImageTk.PhotoImage(image = Image.fromarray(image))

def VideoStream():
    cap = cv2.VideoCapture(0)
    while not CaptureMode:
        ret, frame = cap.read()
        if ret :
            cv2.imshow('CamImg', frame)
            cv2.waitKey(20)
            k = cv2.waitKey(1) & 0xff
            if k == 27: break
        else:
            pass

def setUI():
    def getPicture(event):
        teamp = cv2.imread('Encore\homework\Image\\' + listbox.selection_get()) 

        lblImage = convert2TKImage(teamp)
        label.config(image = lblImage)
        label.image = lblImage

    def loadVideo(event):
        cap = cv2.VideoCapture('Encore/homework/Video/'+videoList.selection_get())

        while(cap.isOpened()):
            ret, frame = cap.read()

            if ret:
                cv2.imshow('video', frame)
                if cv2.waitKey(1) & 0xFF == ord('q'):
                    break
            else:
                break
        cap.release()
        cv2.destroyAllWindows()

    def ShowHideListbox():
        global ShowListBox
        listbox.pack(side = 'top') if ShowListBox == False else listbox.pack_forget()
        videoList.pack(side = 'top') if ShowListBox == False else videoList.pack_forget()
        ShowListBox = True if ShowListBox == False else False

    window = tk.Tk()
    window.title('Black Box')
    window.geometry('640x480+100+100')
    window.resizable(True, True)

    label = tk.Label(window)
    label.pack(side = 'top')

    btnChange = tk.Button(window, text = "모드 전환", command = lambda : ChangeMode())
    btnChange.pack()

    btnShowListBox = tk.Button(window, text = "목록", command = lambda:ShowHideListbox())
    btnShowListBox.pack()

    listbox = tk.Listbox(window, selectmode = 'extended', height = 0)
    for index, value in enumerate(getImageList()):
        listbox.insert(index, str(value))
        listbox.bind('<Double-Button>', getPicture)

    videoList = tk.Listbox(window, selectmode = 'extended', height = 0)
    for index, value in enumerate(getVideoList()):
        videoList.insert(index, str(value))
        videoList.bind('<Double-Button>', loadVideo)
    window.mainloop()


def writeVideo():
    if CaptureMode == False : return
    cap = cv2.VideoCapture(0)

    cap.set(3,320)
    cap.set(4,240)
    now = datetime.datetime.now()
    fourcc = cv2.VideoWriter_fourcc(*'xvid')
    out = cv2.VideoWriter('Encore/homework/Video/'+str(now.day)+'_'+str(now.hour)+'_'+str(now.minute)+'_'+str(now.second)+'.avi', fourcc, 25.0,(320,240))
    
    nextTime = now + datetime.timedelta(seconds=3)
    while True:
        ret, frame = cap.read()
        face = False
        if ret:
            out.write(frame)
            cv2.imshow('Video', frame)
            cv2.waitKey(1)
            if face == False : face = isFace(frame)
            if int((nextTime - datetime.datetime.now()).total_seconds()) == 0:
                break
        else:
            break
    cap.release()
    out.release()
    cv2.destroyAllWindows()
    if face == True: 
        os.replace('')
        print(1)# Face파일로 이동
    threading.Timer(3, writeVideo).start()

def main():
    threading.Timer(0,setUI).start()
    
main()