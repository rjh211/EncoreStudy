list1 = [1,2,3]
list2 = [1,2]

list3 = list1+list2
print(list3)            # 두개의 리스트를 연결

list2.extend([6,7])     # 두개의 리스트 연결
print(list2)

print(max(list1))       #list 의 내장 함수
print(sum(list1))
print(min(list1))
print(len(list1))

#append : 맨오른쪽에 요소추가
#insert : 해당위치에 요소 추가
#extend : 다른 리스트와 결합
#remove : value를 찾아서 return , 없을시 value error 발생
#pop : 마지막 요소 삭제
#pop(idx) : idx위치의 요소 삭제
#clear : 모든 요소 삭제
#count(val) : val 요소의 개수 return
#index(val) : val 요소의 index return, 없을시 value error 발생
#sort : list sort
#reverse : list 역순
#copy : 얕은 복사
#deepcopy : 깊은 복사   (copy 모듈)


#name, tel, address
member = []
def addMember():
    member.append([input("name ?"), input("tel ?"), input("address ?")])
def findMember(name):
    for memb in member:
        if name in memb:
            print("찾는 이름은 ",member.index(memb)+1,"번째에 있습니다.")
            return
    print("찾는 이름이 없습니다.")
addMember()
findMember(input("name : ?"))
print(member)

#객체 초기화
#1.list
# list1 = [1,2,3]
#2. set
# set1 = {1,2,3}
# 3.dictionary
# dic1 = ['name' : 'aaa']

#합집합
# set1.discard(5)
# print(set1)