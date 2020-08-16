from cv2 import cv2
import os

def LoadPicture(num):
    return cv2.imread('Encore\\homework\\Image\\'+str(num)+'.PNG',cv2.IMREAD_COLOR)

def CaptureImage():
    image = cv2.VideoCapture(0)
    _,frame = image.read()
    return frame
maxNum = len(os.listdir('Encore\homework\Image'))-2
num = 1
count = 0
cv2.imshow('Board',LoadPicture(num))
print('press button : p - prev, n - next, c - capture, s - save, q - quit')
switch = chr(cv2.waitKey(0))
while switch != 'q':
    if switch == 'p':
        if num > 1 : 
            num -= 1
            cv2.imshow('Board', LoadPicture(num))
        else: print('첫 번째 이미지')
    elif switch == 'n':
        if num < maxNum+count:
            num += 1
            cv2.imshow('Board', LoadPicture(num))
        else: print('마지막 이미지')
    elif switch == 'c':
        cv2.imshow('Capture Image', CaptureImage())
    elif switch == 's':
        count+=1
        cv2.imwrite('Encore\\homework\\Image\\'+str(maxNum+count)+'.PNG',CaptureImage())
        
    print('press button : p - prev, n - next, c - capture, s - save, q - quit')
    switch = chr(cv2.waitKey(0))