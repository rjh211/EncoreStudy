# from temp import MainUI as win
# from temp import MakeWidget as mkw
import MainUI as win
import MakeWidget as mkw
import Service as s
import tkinter as tk
import FaceDetectService as fds
def main():
    imagePath = 'Encore/temp/Image/a.jpg'
    filePath = 'C:\\Users\\JH\\Downloads\\opencv-master\\data\\haarcascades\\haarcascade_frontalface_alt2.XML'
    root = tk.Tk()
    fdService = fds.FaceDetecService(imagePath, filePath)
    app = win.AppWindow(root, '800x600+100+100', imagePath)
    mkw.Make(app, fdService)
    s.service()
    app.mainloop()
