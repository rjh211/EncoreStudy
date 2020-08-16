import tkinter as tk
import os, time

class Application(tk.Frame):
    def __init__(self, master):
        super().__init__(self, master=None)
        self.master = master
        self.master.geometry('500x600+100+100')
        self.master.resizable(True, True)
        self.pack()
        self.create_widgets()

        self.image = tk.PhotoImage(file = "")
        self.img_viewer = tk.Label(self.master, image=self.img)
        self.img_viewer.pack()

        self.slide = tk.Button(self, width = 10, font = 60, text = "slide")
        self.slide.pack()

        self.stop = tk.Button(self, width = 10, font = 60, text = 'stop')
        self.stop.pack()

    def upload(soc):
        data = soc.recv(1024)
        data2 = data.decode()
        k = data2.split('/')
        f_name = k[0]
        f_size = int(k[1])
        f = open('imgs/'+ f_name, 'wb')
        data = soc.recv(f_size)
        print('body:', data)
        f.write(data)
        f.close()
        app.img = tk.PhotoImage(file = 'imgs/'+ f_name)
        app.img_viewer["image"]
root = tk.TK()
app = Application(master=root)
slide_flag = None

def slide_event():
    global slide_flag
    slide_flag = True
    cnt = 0
    imgs = os.listdir('imgs')
    size = len(imgs)
    while slide_flag:
        app.img = tk.PhotoImage(file = imgs[cnt%size])
        app.img_viewer["image"]=app.img
        cnt += 1
        time.sleep(1)

def stop_event():
    global slide_flag
    slide_flag = False
app.save['command'] = slide_event
app.stop['command'] = stop_event
app.mainloop()