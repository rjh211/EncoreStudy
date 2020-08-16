from cv2 import cv2
import numpy as np

orgImage = cv2.imread('C:/Users/JH/Desktop/playdata/Python_encore/Encore/temp/Image/KakaoTalk_20200623_131353244.jpg',cv2.IMREAD_GRAYSCALE)

cv2.imshow('org',orgImage)
resizeImage = cv2.resize(orgImage,(400, 400))
blurImage = cv2.GaussianBlur(resizeImage,(5,5),0)
_, binaryImage = cv2.threshold(blurImage, 153 , 255, cv2.THRESH_BINARY_INV)

getROI = binaryImage[:300,:]

contours, hierachy = cv2.findContours(getROI.copy(), cv2.RETR_LIST, cv2.CHAIN_APPROX_NONE)
nlabels, labels, stats, centroids = cv2.connectedComponentsWithStats(getROI)
leftList, topList, bottomList, RightList = [],[],[],[]
for i in range(nlabels):
    if i == 0 : continue
    leftList.append([i-1, int(stats[i, cv2.CC_STAT_LEFT])])
    topList.append([i-1, int(stats[i, cv2.CC_STAT_TOP])])
    bottomList.append([i-1,int(stats[i, cv2.CC_STAT_TOP]+ stats[i,cv2.CC_STAT_HEIGHT])])
    RightList.append([i-1,int(stats[i, cv2.CC_STAT_LEFT]+ stats[i,cv2.CC_STAT_WIDTH])])

topIndex , leftIndex, bottomIndex = 0,0,0
mintopIndex = (min(i[1] for i in topList))
for i in topList:
    if mintopIndex == i[1] : 
        topIndex = i[0]
        break
minLeftIndex = (min(i[1] for i in leftList))
for i in leftList:
    if minLeftIndex == i[1] : 
        leftIndex = i[0]
        break
maxBottomIndex = (max(i[1] for i in bottomList))
for i in bottomList:
    if maxBottomIndex == i[1] : 
        bottomIndex = i[0]
        break

posLeftTop = [leftList[topIndex][1], topList[topIndex][1]]
posLeftBottom = [leftList[leftIndex][1], topList[leftIndex][1]]
posRightBottom = [RightList[bottomIndex][1], bottomList[bottomIndex][1]]
posRigtTop = [posRightBottom[1] + posLeftTop[0] - posLeftBottom[0] , posRightBottom[0] + posLeftTop[1] - posLeftBottom[1]]

getROI = cv2.cvtColor(getROI,cv2.COLOR_GRAY2RGB)
cv2.circle(getROI,tuple(posLeftTop),5,(255,0,0),-1)
cv2.circle(getROI,tuple(posLeftBottom),5,(255,0,0),-1)
cv2.circle(getROI,tuple(posRightBottom),5,(255,0,0),-1)
cv2.circle(getROI,tuple(posRigtTop),5,(255,0,0),-1)

pts1 = np.float32([posLeftTop, posLeftBottom, posRightBottom,posRigtTop])
pts2 = np.float32([[10,10],[10,290],[390,290],[390,10]])

M= cv2.getPerspectiveTransform(pts1, pts2)
dst = cv2.warpPerspective(resizeImage,M,(400,300))

cv2.imshow('test', dst)
cv2.waitKey(0)
# topIndex = [i[1] for i in topList].index(min([i[1] for i in topList]))

print('a')