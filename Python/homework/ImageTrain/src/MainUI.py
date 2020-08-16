import tkinter as tk
from cv2 import cv2
from PIL import Image, ImageTk
from functools import partial

class AppWindow(tk.Frame):
    def __init__(self, masterFrame = None, size = None, pathList = None):
        super().__init__(masterFrame)
        self.masterFrame = masterFrame
        self.masterFrame.geometry(size)
        self.masterFrame.resizeable(True, True)
        self. pack()

        self.subFrame = None
        self.src = None
        self.frame = None
        self.pathList = pathList

    def CreateWidgets(self, imagePath):
        self.frame = tk.Label(self.masterFrame, image = self.src)
        self.frame.pack()
        self.subFrame = tk.Frame(self.masterFrame)
        self.subFrame.pack()

    def SetImage(self,path):
        src = cv2.imread(path)
        src = cv2.resize(src, (640, 480))
        img = cv2.cvtColor(src, cv2.COLOR_BGR2RGB)
        img = Image.fromarray(img)
        self.src = ImageTk.PhotoImage(image= img)

    def ChangeImg(self, image):
        src = cv2.resize(image, (640, 480))
        img = cv2.cvtColor(src, cv2.COLOR_BGR2RGB)
        image = Image.fromarray(img)
        self.src = ImageTk.PhotoImage(image= img)
        self.frame['image'] = self.src

    def MakeWidget(self, fdService):
        self.fdService = fdService

        self.ent = tk.Entry(self.subFrame, width = 60)
        self.btnRecogFace = tk.Button(self.subFrame, width = 10, font = 60, text = "얼굴인식")
        self.btnRecogEye = tk.Button(self.subFrame, width = 10, font = 60, text = "눈인식")
        self.btnRecogSmile = tk.Button(self.subFrame, width = 10, font = 60, text = "미소 인식")
        self.btnRecogTrain = tk.Button(self.subFrame, width = 10, font = 60, text = "학습")
        self.btnRecogTest = tk.Button(self.subFrame, width = 10, font = 60, text = "테스트")

        self.ent.grid(row= 0 , column = 0 , columnspan = 5)
        self.btnRecogFace.grid(row = 1, column = 0)
        self.btnRecogEye.grid(row = 1, column = 1)
        self.btnRecogSmile.grid(row = 1, column = 2)
        self.btnRecogTrain.grid(row = 1, column = 3)
        self.btnRecogTest.grid(row = 1, column = 4)

        self.btnRecogFace.bind('<Button=1>', command = self.btnRecogFace_clicked)
        self.btnRecogEye.bind('<Button=1>', partial())
        self.btnRecogSmile.bind('<Button=1>', partial())
        self.btnRecogTrain.bind('<Button=1>', partial())
        self.btnRecogTest.bind('<Button=1>', partial())

    def btnRecogFace_clicked(self):
        flg = self.fdService.face_detect()
        if flg : self.ChangeImage(self.fdService.res)

    def btnRecogEye_clicked(self, fdService, event):
        flg = fdService.eye_detect()
        if flg : app.ChangeImage(fdService.res)

    def btnRecogSmile_clicked(self, fdService, event):
        flg = fdService.smile_detect()
        if flg : app.ChangeImage(fdService.res)

    def btnTrain_clicked(self, fdService, event):
        flg = fdService.FaceRecogTrain()

    def btnTest_clicked(self, fdService, event):
        flg = fdService.faceRecogTest()
