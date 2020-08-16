#객체 초기화
#1.list
# list1 = [1,2,3]
#2. set                 #중복을 허용하지 않는다. 자동 정렬
# set1 = {1,2,3}
# 3.dictionary
# dic1 = ['name' : 'aaa']

list1 = [1,5,2,3,3]
set1 = set(list1)
print(set1)
set1.add(3)             #중복되는 값을 add하면 추가되지않음 
print(set1)
set1.update([1,2,3,4])      #4만 추가

print(set1)

set1.remove(3)              #3제거
print(set1)
print(set1.pop())           #제일 앞 인덱스 반환
print(set1)

#set1.clear()                #모든 요소 삭제


#합집합
set2 = {7,8,9,4}

set3 = set1 | set2          #합집합
print(set3)

set3 = set1&set2            #교집합
print(set3)

set3 = set1 - set2          #차집합
print(set3)

set3 = set1.difference(set2)    #차집합
print(set3)

set3 = set1^set2            #합집합 - 교집합
print(set3)

print(set1.symmetric_difference(set2))  #합집합 - 교집합

print(set1 > set2)          #포함 관계 < == > !=

#튜플                   - 고정된 데이터를 프로그램에서 활용할때 사용, 변경을 허용하지 않는 집합 데이터, CRUD 불가능(우회적으로는 가능)
tuple1 = (1,2,3)
print(tuple1)

tuple2 = (3,4,[5,6,7])  #튜플 내부의 list요소는 접근가능
tuple2[2].append(8)
print(tuple2)

lst = [1,2,3,4]
tuple4 = tuple(lst)     #list를 사용해서 tuple변환 요소를 복사해서 생성
print(tuple4)
print(tuple2[0], tuple4[0])

tuple5 = (1,)           # 1개의 요소로는 tuple생성이 불가능 하기때문에 ,를 사용 해야한다.
print(tuple5[-1])

tuple6 = ((1,2,3),(4,5))
for i in tuple6:
    for j in i:
        print(j, end= ' ')
tuple7 = (1,2,3,4,5)
print(tuple6[tuple7.index(1): tuple7.index(3)])

del tuple7              #tuple 삭제

students = (1,"a",34,54,56,2,"b",65,67,87,3,"c",98,78,87)
for i in range(3):
    print(i,"번째 사람")
    print("번호 : ",students[5*i+0])
    print("이름 : ",students[5*i+1])
    print("국어 : ",students[5*i+2])
    print("영어 : ",students[5*i+3])
    print("수학 : ",students[5*i+4])
    print("평균 : ",(students[5*i+2] +students[5*i+3]+students[5*i+4])/3)

for i in range(0,3):
    print(i+1,"번째 학생")
    num,name,kor,eng,math = students[i*5:i*5+5]
    total  = kor+eng+math
    avg = int(total / 3)
    print(num, name,kor, eng,math, total, avg)

#dictionary
#key를 seed값으로 하여 난수 발생 => hash code 생성 => linked list로 유지함
#키 중복 및 변경 불가 , immutable한 값만 사용 가능 (숫자, 문자, 튜플만 사용 가능, 리스트, 셋 사용 불가)
#value는 모든 타입 및 중복 가능, 변경도 가능
#1. 생성
d1 = {'키1' : '값2', "키2" : "값2"}
print(d1)
print(d1.pop('키1'))    #해당 key값 pop
print(d1)
print(d1.popitem()) #맨오른쪽 pop
print(d1)

k1, k2, k3 = {1,2,3}
v1, v2, v3 = {23, 45, 67}
d2 = {k1:v1, k2:v2, k3:v3}
print(d2)

d3 = dict([(1,'aaa'),(2,'bbb'),(3, 'ccc')]) #dictionary 생성자에 tuple이 담긴 list를 사용하여 dictionary 생성
print(d3)

print(d3[1])        #key를 사용하여 value 접근
print(d3.get(1))    #위와 동일

for i in d3:
    print(i , d3[i])       #key와 value 출력

v = d3.items()          #전체 목록 가져오기
print(v)

#수정 삭제 
d3[1] = 'ddd'       #key 1의 value를 ddd로 수정
print(v)

del d3[1]           #key 1의 key, value 삭제
print(v)

d3.clear()          #모든 항목삭제
print(v)