#파일 입출력 = > open(filename, mode) =>파일 객체 반환
# mode => r : 읽기 , w : 쓰기(기존에 있던 파일의 내용을 다지우고 열어줌) , a : 이어쓰기(기존 내용 유지) => 파일 없으면 에러(w제외) 
# br,bw,ba : binary 
# r+,w+,a+ : 읽고쓰기 다됨 a만 이어쓰기
f = open('C:\\Users\\JH\\Desktop\\Python\\Encore\\fileIOTest.txt','r',encoding='UTF-8')
for i in f:
    print(i)
f.close()

#닫기 close()

#읽기 
# read(size)
# read()
# readline()
with open ('a.txt','r') as f:
    s = f.read()
    print(s)

f = open('b.txt','w')
while True:
    s = input()
    if s == '/stop':
        break
    else:
        f.write(s)
        f.write('\n')
f.close()

f = open('b.txt','r')
while True:
    s = f.readline()
    if s == '':
        break
    else:
        print(s)
f.close()

f = open('b.txt','a')
while True:
    s = input()
    if s == '/stop':
        break
    else:
        f.write(s+'\n')
f.close()

#파일 제어
# 1) 파일 절삭
# f.truncate(size)
# 2) 파일명 바꾸기
# import os
# os.rename(old, new)
# 3) 파일 삭제
# os.remove(파일명)