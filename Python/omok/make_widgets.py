import tkinter as tk
from functools import partial
import copy
import time

def btn1_clicked(app, service, event):
    app.prev_data = copy.deepcopy(app.points)

def btn2_clicked(app, event):
   app.color = 1

def btn3_clicked(app, event):
   app.color = 0

def btn4_clicked(app, service, event):
    app.stat_init()
    service.save_data(app.data, app.label)

def me(app):
    app.color = 0
    #time.sleep(10)
    app.testing()

def other(app):
    app.color = 1
    app.testing()

def game(app):
    print('테스팅 시작')
    for i in range(0, 10):
        me(app)
        other(app)

def btn5_clicked(app, event):
    #app.stat_init()
    game(app)

def make(app, service):
    app.btn1 = tk.Button(app.sub_fr, width=10, font=60, text='학습시작')
    app.btn2 = tk.Button(app.sub_fr, width=10, font=60, text='흰돌')
    app.btn3 = tk.Button(app.sub_fr, width=10, font=60, text='검정돌')
    app.btn4 = tk.Button(app.sub_fr, width=10, font=60, text='학습종료')
    app.btn5 = tk.Button(app.sub_fr, width=10, font=60, text='테스팅')

    app.btn1.grid(row=0, column=0)
    app.btn2.grid(row=0, column=1)
    app.btn3.grid(row=0, column=2)
    app.btn4.grid(row=0, column=3)
    app.btn5.grid(row=0, column=4)

    app.btn1.bind('<Button-1>', partial(btn1_clicked, app, service))
    app.btn2.bind('<Button-1>', partial(btn2_clicked, app))
    app.btn3.bind('<Button-1>', partial(btn3_clicked, app))
    app.btn4.bind('<Button-1>', partial(btn4_clicked, app, service))
    app.btn5.bind('<Button-1>', partial(btn5_clicked, app))

'''
    app.btn1.bind('<Button-1>', partial(btn1_clicked, service))
    app.btn2.bind('<Button-1>', partial(btn2_clicked, service))
    app.btn3.bind('<Button-1>', partial(btn3_clicked, service))
    app.btn4.bind('<Button-1>', partial(btn4_clicked, service))
    app.btn5.bind('<Button-1>', partial(btn5_clicked, service))
    app.btn6.bind('<Button-1>', partial(btn6_clicked, service))

'''