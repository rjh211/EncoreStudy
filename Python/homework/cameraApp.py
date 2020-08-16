from cv2 import cv2
import os
import tkinter as tk
from PIL import Image, ImageTk


class CameraApp:
    def __init__(self):
        self.window=tk.Tk()
        self.num = 1
        self.maxNum = len(os.listdir('Encore\homework\Image'))
        self.Mode = 'Picture'
    def UISet(self):
        self.window.title("Camera")
        self.window.geometry("640x720+200+200")
        
        src = cv2.imread("Encore\\homework\\Image\\1.PNG")

        imgtk = self.convert2TKImage(cv2.cvtColor(src, cv2.COLOR_BGR2RGB))

        label = tk.Label(self.window, image=imgtk)
        label.pack(side="top")

        btnMode = tk.Button(self.window, text="모드 전환", command = lambda : self.ChangeMode(label))
        btnMode.pack(side = "bottom", expand = True, fill = 'both')

        btnCaptureGray = tk.Button(self.window, text = "흑백 촬영", command = lambda : self.captureImage(label, 'Gray'))
        btnCaptureGray.pack(side = "bottom", expand=True, fill='both')

        btnCaptureGray = tk.Button(self.window, text = "컬러 촬영", command = lambda : self.captureImage(label))
        btnCaptureGray.pack(side = "bottom", expand=True, fill='both')

        btnPrev = tk.Button(self.window, text = "이전 이미지", command = lambda : self.ShowImage(label, "Prev"))
        btnPrev.pack(side = "bottom", expand=True, fill='both')

        btnNext = tk.Button(self.window, text = "다음 이미지", command = lambda : self.ShowImage(label, "Next"))
        btnNext.pack(side = "bottom", expand=True, fill='both')

        btnRemove = tk.Button(self.window, text = "삭제", command = lambda : self.RemoveFile(label))
        btnRemove.pack(side = "bottom", expand=True, fill='both')

        self.window.mainloop()

    def convert2TKImage(self, cvImage):
        image = cv2.resize(cvImage, (640, 400))
        return ImageTk.PhotoImage(image = Image.fromarray(image))

    def ShowImage(self, label, mode):
        if mode == "Prev" and self.num > 1: self.num -= 1
        elif mode == "Next" and self.num < self.maxNum: self.num += 1
        src = cv2.imread("Encore\\homework\\Image\\"+str(self.num)+".PNG")
        imgtk = self.convert2TKImage(cv2.cvtColor(src, cv2.COLOR_BGR2RGB))
        label.config(image = imgtk)
        label.image = imgtk

    def captureImage(self, label, mode = 'Color'):
        cap = cv2.VideoCapture(0)
        _, frame = cap.read()

        if mode == 'Gray':
            frame = cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY)
        imgtk = self.convert2TKImage(cv2.cvtColor(frame, cv2.COLOR_BGR2RGB))
        label.config(image = imgtk)
        label.image = imgtk

        cap.release()
    def RemoveFile(self, label):
        os.remove("Encore\\homework\\Image\\test.PNG")
        # self.ShowImage(label,"Next")

    def ChangeMode(self, label):
        self.Mode = 'Stream' if self.Mode == 'Picture' else 'Picture'
        if self.Mode == 'Stream':
            cap = cv2.VideoCapture(0)
            def video_stream():
                _, frame = cap.read()
                cv2image = cv2.cvtColor(frame, cv2.COLOR_BGR2RGBA)
                img = Image.fromarray(cv2image)
                imgtk = ImageTk.PhotoImage(image=img)
                label.imgtk = imgtk
                label.configure(image=imgtk)
                if self.Mode == 'Stream':
                    label.after(1, video_stream)
                elif self.Mode == 'Picture':
                    cap.release()
                    src = cv2.imread("Encore\\homework\\Image\\"+str(self.num)+".PNG")
                    imgtk = self.convert2TKImage(cv2.cvtColor(src, cv2.COLOR_BGR2RGB))
                    label.config(image = imgtk)
                    label.image = imgtk
            video_stream()
        elif self.Mode == 'Picture':
            cap.release()
            src = cv2.imread("Encore\\homework\\Image\\"+str(self.num)+".PNG")
            imgtk = self.convert2TKImage(cv2.cvtColor(src, cv2.COLOR_BGR2RGB))
            label.config(image = imgtk)
            label.image = imgtk
    def main(self):
        self.UISet()
        
CA = CameraApp()
CA.main()