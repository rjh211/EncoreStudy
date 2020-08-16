import copy

listArr = []
listArr.append([i for i in range(5)])       #얕은 복사
listArr.append(listArr[0])

listArr[1][0] = 10

print(listArr)

listArr.append(copy.deepcopy(listArr[0]))        #깊은 복사
listArr[2][0] = 20

print(listArr)

listArr.append(copy.copy(listArr[0]))           #약간 깊은 복사
listArr[3][0] = 30

print(listArr)

for i in listArr:
    print(id(i))

listArr2 = []
listArr2.append([1,2,[3,4,5]])
listArr2.append(listArr2[0])
listArr2[1][0] = 10

print(listArr2)

listArr2.append(copy.copy(listArr2[0]))     #약간 깊은 복사에서는 내부 참조값을 가져오기때문에 2중 배열에서는 내부 배열의 값이 같이 바뀜
listArr2[2][2][0] = 20

print(listArr2)


listArr2.append(copy.deepcopy(listArr2[0])) #깊은복사 
listArr2[3][2][0] = 30

print(listArr2)

for i in listArr2:
    print(id(i))


#mutable type - list , set, dictionary
#immutable type - int, bool, float, tuple, str
#값이 바뀔떄 주소도 바뀐다. - immutable하다는 증거
a = 10
print(id(a))
a = 20
print(id(a))        #a의 주소값이 바뀜 해당 int에대한 참조값을 담고있기 떄문
b= 10
print(id(b))