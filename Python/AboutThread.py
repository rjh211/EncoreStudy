import threading, time

def f1(cnt):
    for i in range(1, cnt+1):
        print('f1 thread : ', i,'\n')
        time.sleep(1)

def f2():
    for i in range(97, 123):
        print('f2 thread : ',chr(i),'\n')
        time.sleep(1)

def main():
    t1 = threading.Thread(target=f1, args=(10,))        #튜플형태로 넣어줘야 하기때문에 ,을 넣어야 한다.
    t1.start()

    t2= threading.Thread(target=f2, args=())            #파라밈터가 없는경우
    t2.start()

    for i in range(100, 123):
        print('main', i,'\n')
        time.sleep(1)

main()