import os
import pandas as pd
import numpy as np
from sklearn import svm, metrics
from sklearn.model_selection import train_test_split

class TrainService:
    def __init__(self):
        self.path1 = 'omok_train.csv'
        self.path2 = 'omok_res.pkl'
        self.train_data = []
        self.train_label = []
        self.clf = None

    def train_start(self):
        if os.path.isfile(self.path1):
            with open(self.path1, 'r', encoding='utf-8') as f:
                while True:
                    s = f.readline()
                    if s!='\n':
                        s2 = s.split(',')
                        l = s2[0]  #파일의 앞 1개만 레이블
                        d = s2[1:]  #나머지 뒤는 모두 데이터
                        self.train_label.append(l)
                        self.train_data.append(d)

    def new_train(self):
        self.clf = svm.SVC()
        self.clf.fit(self.train_data, self.train_label)
        pre = self.clf.predict(self.train_data)
        score = metrics.accuracy_score(self.train_label, pre)
        print('score:', score)

    # 학습 테스팅 함수. 컴퓨터가 오목을 둘 순서가 되면 이 함수를 호출하여
    # 현재 오목판의 상태값을 test_data로 주면 이에 대한 예측값을 반환한다.
    def return_pred(self, test_data):
        data_np = np.array(test_data, dtype=np.int32)
        data_np = data_np.ravel()
        pre = self.clf.predict([data_np])
        print(pre)
        return pre

    # 학습종료 버튼 클릭시 지금까지의 상태와 레이블을 파라메터로 전달하여 머신에 학습시킴
    def save_data(self, data, label):
        d = []
        for points in data:
            data_np = np.array(points, dtype=np.int32)
            data_np = data_np.ravel()
            d.append(data_np)

        self.train_data = d
        self.train_label = label

        print(self.train_data)
        print(self.train_label)
        self.new_train()


