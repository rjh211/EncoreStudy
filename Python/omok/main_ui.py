import tkinter as tk
import copy

class AppWindow(tk.Frame):
    def __init__(self, master=None, size=None, service=None):
        super().__init__(master)
        self.master = master
        self.service = service
        self.master.geometry(size)
        self.master.resizable(False, False)
        self.pack()
        self.points = []# 돌을 놓을 수 있는 모든 자리를 담음.[x,y,s,c]s(0:비었음,1:돌있음), c(0:검정, 1:흰)
        self.prev_data = None #수를 놓기 전의 오목판 상태
        self.data = [] #수를 놓은 뒤 위 prev_data를 이 배열에 추가
        self.label = [] #추가된 수
        self.color = None
        self.create_widgets()

    def stat_init(self):
        self.points = []
        self.prev_data = None
        self.color = None
        self.frame.delete('all')
        self.make_line()

    def testing(self):#기계가 결정한 수
        idx = self.service.return_pred(self.points)
        su = self.points[idx[0]]
        self.make_hansu(su)

    def motion(self, event):
        x, y = event.x, event.y
        x_n = x % 50
        y_n = y % 50
        if x_n >= 25:
            x += 50-x_n
        else:
            x -= x_n
        if y_n >= 25:
            y += 50-y_n
        else:
            y -= y_n
        print(x, ',', y)
        self.getPoint(x, y)

    def getPoint(self, x, y):
        for p in self.points:
            if p[0]==x and p[1]==y:
                self.make_hansu(p)


    def make_hansu(self, point):
        if point[2] != 0:
            print('이미 돌이 있음')
        else:
            if self.color == 0:
                color = 'black'
            elif self.color == 1:
                color = 'white'
            else:
                print('돌 색이 지정되지 않았음. 수가 취소됨')
                return

            self.frame.create_oval((point[0] - 20, point[1] - 20), (point[0] + 20, point[1] + 20), fill=color)
            point[2]=1
            point[3] = self.color
            self.make_data(point)

    def make_data(self, p):#학습시킬 데이터 추가 메서드
        self.data.append(self.prev_data)
        self.label.append(self.points.index(p))
        self.prev_data = copy.deepcopy(self.points)

    def make_line(self):
        for x in range(0, 600, 50):
            self.frame.create_line((x, 0), (x, 550))
            for i in range(0, 550, 50):
                if x!=0 and i!=0:
                    self.points.append([x, i, 0, 0])
        for y in range(0, 550, 50):
            self.frame.create_line((0, y), (600, y))


    def print_allsu(self):
        for i in self.points:
            if i[2]!=0:
                if i[3]==0:
                    color='black'
                else:
                    color='white'
                self.frame.create_oval((i[0]-20, i[1]-20),(i[0]+20, i[1]+20), fill=color)

    def create_widgets(self):
        self.frame = tk.Canvas(self.master, width=600, height=550, background='yellow')
        self.make_line()
        self.frame.pack()
        self.sub_fr = tk.Frame(self.master)#frame
        self.sub_fr.pack()
        self.frame.bind('<Button-1>', self.motion)
