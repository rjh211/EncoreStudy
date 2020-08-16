from PIL import Image
from cv2 import cv2
import numpy as np
from pytesseract import *

global fileName 
fileName= "C:/Users/JH/Desktop/playdata/Python_encore/Encore/homework/Image/carNum.PNG"
# image = Image.open(fileName)
# text = image_to_string(image, lang="eng") #한글 ㅣ "kor"
# print(text)

def findROI():
    img = cv2.imread(fileName, cv2.CV_8U)
    img = cv2.resize(img, (400, 400))
    cv2.imwrite('C:/Users/JH/Desktop/playdata/Python_encore/Encore/homework/Image/temp.PNG',img[250:300, 150:300])
    
def OCR():
    image = Image.open('C:/Users/JH/Desktop/playdata/Python_encore/Encore/homework/Image/temp.PNG')
    text = image_to_string(image, lang = "kor")
    print(text)

findROI()
OCR()
