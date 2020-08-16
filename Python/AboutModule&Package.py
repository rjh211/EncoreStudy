#경로 등록
#sys.path.append('path')

#모듈 내 함수 , 변수사용
# import module.module1

# print("num : ", module.module1.num)
# print("msg : ", module.module1.msg)
# lst = module.module1.makeList()
# print(lst)
# print(module.module1.sumList(lst))
# module.module1.cnt(module.module1.num)

#모듈내 함수 나 변수 하나만 가져오기
# from module.module1 import makeList
# print(makeList())
import sys
sys.path.append('C:\\Users\\JH\\Desktop\\Python')
import MyPackage
MyPackage.test1()