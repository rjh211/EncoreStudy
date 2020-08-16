import tkinter as tk
from cv2 import cv2
from functools import partial
import os

count = 0
imageFolderpath = 'Encore/temp/Image'
imagePathList = os.listdir(imageFolderpath)

def Make(app, fdService):
    app.ent = tk.Entry(app.subFrame, width = 60)
    app.btnRecogFace = tk.Button(app.subFrame, width = 10, font = 60, text = '얼굴 인식')
    app.btnRecogEye = tk.Button(app.subFrame, width = 10, font = 60, text = '눈 인식')
    app.btnRecogSmile = tk.Button(app.subFrame, width = 10, font = 60, text = '미소 인식')
    app.btnTrain = tk.Button(app.subFrame, width = 10, font = 60, text = '학습')
    app.btnTest = tk.Button(app.subFrame, width = 10, font = 60, text = '테스트')
    app.btnNext = tk.Button(app.subFrame, width = 10 , font = 60, text = "다음")
    app.btnPrev = tk.Button(app.subFrame, width = 10 , font = 60, text = "이전")

    app.ent.grid(row = 0 , column = 0, columnspan = 7)
    app.btnRecogFace.grid(row = 1, column = 0)
    app.btnRecogEye.grid(row = 1, column = 1)
    app.btnRecogSmile.grid(row = 1, column = 2)
    app.btnTrain.grid(row = 1, column = 3)
    app.btnTest.grid(row = 1, column = 4)
    app.btnNext.grid(row =1, column = 5)
    app.btnPrev.grid(row =1, column = 6)

    app.btnRecogFace.bind('<Button-1>', partial(btnRecogFace_clicked, app, fdService))
    app.btnRecogEye.bind('<Button-1>', partial(btnRecogEye_clicked, app, fdService))
    app.btnRecogSmile.bind('<Button-1>', partial(btnRecogSmile_clicked, app, fdService))
    app.btnTrain.bind('<Button-1>', partial(btnTrain_clicked, app, fdService))
    app.btnTest.bind('<Button-1>', partial(btnTest_clicked, app, fdService))
    app.btnNext.bind('<Button-1>', partial(btnNext_clicked, app, fdService))
    app.btnPrev.bind('<Button-1>', partial(btnPrev_clicked, app, fdService))


def btnRecogFace_clicked(app, fdService, event):
    flg = fdService.face_detect()
    if flg : app.ChangeImage(fdService.res)

def btnRecogEye_clicked(app, fdService, event):
    flg = fdService.eye_detect()
    if flg : app.ChangeImage(fdService.res)
def btnRecogSmile_clicked(app, fdService, event):
    flg = fdService.smile_detect()
    if flg : app.ChangeImage(fdService.res)

def btnTrain_clicked(app, fdService, event):
    fdService.FaceRecogTrain()

def btnTest_clicked(app, fdService, event):
    fdService.faceRecogTest()

def btnNext_clicked(app, fdService, event):
    global imagePathList, count
    if count < len(imagePathList)-1: 
        count += 1
        app.ChangeImage(cv2.imread(imageFolderpath + '/' +imagePathList[count]))
        fdService.src = imageFolderpath + '/' +imagePathList[count]

def btnPrev_clicked(app, fdService, event):
    global imagePathList, count
    if count >= 1 : 
        count-= 1
        app.ChangeImage(cv2.imread(imageFolderpath + '/' +imagePathList[count]))
        fdService.src = imageFolderpath + '/' +imagePathList[count]