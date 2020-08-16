import random

tmp = [0] * 9
cnt =1 
while cnt <10:
    x = random.randint(0,8)
    if tmp[x] == 0:
        tmp[x] = cnt
        cnt += 1

cnt = 0
pan = [[0,0,0],[0,0,0],[0,0,0]]
for i in range(0,3):
    for j in range(0,3):
        pan[i][cnt%3] = tmp[cnt]
        cnt+=1

def Bingo(pan : list):
    count = 0
    test = 0
    resList = [[False for test in pan] for _ in pan[test]]
    randList = [0 for _ in range(len(pan)* len(pan[0]))]
    for i in range(len(randList)):
        while randList[i] == 0:
            randVal = random.randint(0,9)
            if randVal not in randList:
                randList[i] = randVal

    for i in randList:
        count+=1
        for a in range(len(pan)):
            for b in range(len(pan[a])):
                if pan[a][b] == i:
                    resList[a][b] = True
        if count >= 3:
            for i in range(len(pan)):
                if resList[i][0] == True:
                    bingoCount = 1
                    for j in range(1,len(pan[i])):
                        if resList[i][j] == True: 
                            bingoCount +=1
                        else:
                            break
                        if bingoCount == 3:
                            return count
            for col in range(len(pan[0])):
                if resList[0][col]== True:
                    bingoCount = 1
                    for row in range(1,len(pan)):
                        if resList[row][col] == True:
                            bingoCount+=1
                        else:
                            break
                        if bingoCount == 3:
                            return count
    return(1)

print(Bingo(pan))