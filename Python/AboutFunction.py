def Sum(a,b):
    return a+b
def sub(a,b):
    return a-b
def mul(a,b):
    return a*b
def div(a,b):
    return a/b if b != 0 else '0으로는 나눌수없음'
# num = list(map(int, input().split('+')))
# result = num[0]
# for i in range(0, len(num)-1):
#     result = sum(result, num[i+1])

# print(result)

# numlist = list(input())
# result = int(numlist[0])
# for i in range(0,len(numlist)):
#     if numlist[i] == '+':
#         result = Sum(result, int(numlist[i+1]))
#     elif numlist[i] == '-':
#         result = sub(result, int(numlist[i+1]))
#     elif numlist[i] == '*':
#         result = mul(result, int(numlist[i+1]))
#     elif numlist[i] == '/':
#         result = div(result, int(numlist[i+1]))
# print(result)

# 참조값
# def mutableArg(arg1, arg2):
#     print("함수 시작")
#     print("변경 전")
#     print("arg1:", arg1,", arg2 : ", arg2)
#     print("arg1의 참조값 : ",id(arg1),"arg2의 참조값 ㅣ ",id(arg2))
#     arg1 = [100,200]
#     arg2[0] = 400
#     arg2[1] = 500
#     print("변경 후")
#     print("arg1:", arg1,", arg2 : ", arg2)
#     print("arg1의 참조값 : ",id(arg1),"arg2의 참조값 ㅣ ",id(arg2))
#     print("함수 종료")

# def main():
#     list1 = [1,2,3]
#     list2 = [4,5]
#     print("함수 호출 전")
#     print("list1:", list1,", list2 : ", list2)
#     print("list1 참조값 : ",id(list1),"list2 참조값 ㅣ ",id(list2))
#     mutableArg(list1, list2)
#     print("함수 호출 후")
#     print("list1:", list1,", list2 : ", list2)
#     print("list1 참조값 : ",id(list1),"list2 참조값 ㅣ ",id(list2))
# main()

# def f1(l1):
#     print('l1:',l1)
#     for i in range(0,len(l1)):
#         l1[i] *= 10
#     print('l1:',l1)
#     print('f1의 li참조값: ', id(l1))    #새로 객체를 생성해서 사용함
# def main():
#     l2 = [1,2,3,4,5]
#     print('main의 l2참조값',id(l2))
#     print('main f1호출전', l2)
#     f1(l2[:])
#     print("main, f1 호출뒤 : ", l2)

# main()

#함수
# 1.정의
# def 함수명 (param list)
#     실행문
#     return
# 2.호출
# 함수명(arg)

# 3.arg 종류
# 1)요구 인자 : 함수 호출시 파라메터의 개수와 순서에 맞게 인자를 전달해야함
# 2)키워드 인자 : 어떤 인자가 어떤 파라메터로 복사될지 지정
# ex) 
# def f1(name , tel = '1234' , address = '15aa'):      #파라메터 기본값 지정(기본값 지정 안하는 param이 제일 앞으로 가야함)
#     print(name)
#     print(tel)
#     print(address)

# f1(tel='123',address='243',name='aaa')  #키워드인자
# 4.가변인자
# ...
# param의 개수가 여러개임
# ex) c에서의 printf => printf(char *, ...)
#     python에서의 가변인자 => def f1(*arg)
def varArg(msg1, *msg):
    print("msg의 타입 :", type(msg))     # tuple
    print("고정인자 개수 :", 1)
    print("가변인자 개수 :", len(msg))
    print("msg : ", msg1, end=",")
    for m in msg:
        print(m,end=',')
    print()
def varArg2(*nums):
    print("nums의 타입 : ", type(nums))
    print("가변 인자 개수", len(nums))
    sum =0
    for n in nums:
        sum += n
    return sum
print(varArg2(1,2,3,4,5))

#5. 지역변수 전역변수
# 함수내에서만 사용되는 변수 =>지역변수
# 전역변수 => 함수외부에서 호출되어 함수내부에서 변경해도 함수내의 변수에만 영향이간다.
# 함수내에서 전역변수에 영향을 주려면 global 키워드를 사용해야함


#함수 내부에 지역함수 정의 가능
def outerFunc():
    x = int(input())
    if x == 1:
        def win():
            print("win 지역함수")
    elif x == 2:
        def linux():
            print("linux 지역함수")
    else:
        def other():
            print("other 지역함수")
    win()
    linux()
    other()

# outerFunc()


#재귀 함수
# 함수안에서 스스로를 호출하는 함수(종료 로직을 잘짜야함, stack overflow 주의)
def factorialLoop():
    num = int(input())
    result = 1
    for _ in range(1,num):
        result *= num
    return result

#함수 객체

def printMsg(msg):
    print(msg)

def Func():
    printMsg('en-core')
    x = printMsg                  #함수의 포인터를 x에 담음
    print(x)
    x('함수 객체로 함수 호출')      #함수 호출
    y= outerFunc
# Func()


#핸들러
def OnEvent(f):
    print("핸들러 등록")
    f()
    print()
def myHandler1():
    print("1번 핸들러")
def myHandler2():
    print("2번 핸들러")
def myHandler3():
    print("3번 핸들러")

def handlerMain():
    OnEvent(myHandler1)
    OnEvent(myHandler2)
    OnEvent(myHandler3)
# handlerMain()

# LUT => 반복되는 조건문들을 사용해서 비교를 할시 성능 향상을 위해 Look up table을 사용

def notUseLUT():
    num = int(input("0 1 2 : "))
    if num == 0:
        f1()
    elif num == 1:
        f2()
    else:
        f3()

def UseLUT():
    list1=[f1,f2,f3]    #각함수의 참조값을 list로 LUT작성
    list1[int(input("0 1 2 : "))]()  #input 받은 숫자로 함수 작동

def f1():
    print("1번함수")
def f2():
    print("2번함수")
def f3():
    print("3번함수")

# while True:
#     UseLUT()
from collections import Counter
def GameMain():
    lst = [Event, Notevent]
    num = int(input("숫자 입력 : "))
    for i in range(0,num+1):
        a = Counter(list(map(int, str(i))))
        count = a[3] + a[6] + a[9]
        if count == 0:
            lst[1](i)
        else :
            lst[0](count)


def Event(x):
    string = ''
    for _ in range(x):
        string += "짝"
    print(string)
def Notevent(x):
    print(x)

GameMain()