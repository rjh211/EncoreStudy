num = 10
msg = 'hello'

def cnt(x):
    for i in range(1,x+1):
        print(i, end=',')
    print()
def makeList():
    print("숫자 5개 입력")
    return [int(input()) for i in range(0,5)]
def sumList(lst):
    return sum(lst)