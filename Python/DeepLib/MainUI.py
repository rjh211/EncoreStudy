import tkinter as tk
from cv2 import cv2
from PIL import Image, ImageTk


class AppWindow(tk.Frame):      #Frame을 상속받앗으므로 해당 클래스도 Frame이다.
    def __init__(self, master=None, size = None, path = None): #master = tk의 객체
        super().__init__(master)
        self.master = master
        self.master.geometry(size)
        self.master.resizable(True, True)
        self.pack()             #사진을 뿌리기위한 Frame

        self.subFrame = None    #tk Label에 출력할 영상
        self.src= None
        self.frame = None
        self.CreateWidgets(path)

    def CreateWidgets(self, imagePath):
        self.MakeImg(imagePath)
        self.frame = tk.Label(self.master, image=self.src)
        self.frame.pack()
        self.subFrame = tk.Frame(self.master)
        self.subFrame.pack()
    
    def MakeImg(self, path):
        src = cv2.imread(path)
        src = cv2.resize(src, (640, 480))
        img = cv2.cvtColor(src, cv2.COLOR_BGR2RGB)
        img= Image.fromarray(img)
        self.src = ImageTk.PhotoImage(image = img)

    def ChangeImage(self, image):
        res = cv2.resize(image, (640, 480))
        img = cv2.cvtColor(res, cv2.COLOR_BGR2RGB)
        img = Image.fromarray(img)
        self.src = ImageTk.PhotoImage(image = img)
        self.frame['image'] = self.src