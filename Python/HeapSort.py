import sys
# 숙제 Heap, Hash,java로 linked list 구현(참조값 사용), 피보나치 list, 변수 이용

def fibonacciList():
    lst = [0,1]
    for i in range(2, int(input("n 번째 : "))):
        lst.append(lst[i-1] + lst[i-2])
    print(lst)

def fibonacciValue():
    a,b = 0,1
    for _ in range(int(input("n 번째 : "))):
        c = a + b
        a = b
        b = c
    print(c)
# while True:
#     fibonacciValue()

def Heapify(index):
    left, right, largest, length = index*2+1, index*2+2, index, len(lst)
    if left < length - 1 and lst[left] > lst[largest]:
        largest = left
    if right< length - 1 and lst[right] > lst[largest]:
        largest = right
    if largest != index:
        lst[largest] , lst[index] = lst[index], lst[largest]
        Heapify(largest)
def HeapSort():
    newList = []
    for i in range(len(lst)//2 -1 , -1, -1):
        Heapify(i)

    for i in range(len(lst)-1 ,-1,-1):
        lst[i] , lst[0] = lst[0], lst[i]
        newList.append(lst.pop())
        Heapify(0)
    print(newList)
while True:
    lst = list(map(int, sys.stdin.readline().split()))
    HeapSort()