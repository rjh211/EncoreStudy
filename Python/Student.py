# 1. 학생 , 2.교수 3. 교직원
# 1) 교직원이 과목 등록 -> 과목코드, 과목명
#   교직원의 기능 : 과목등록/ 과목 리스트 출력
#   교수의 기능 :   
#           과목개설 / 교직원이 등록한 과목중 개설이되지 않은 과목을 선택하여 개설(개설 유무 값이 필요) -> 요일/시간, 강의실, 학점, 인원수, 과목개요
#           내가 개설한 과목 조회, 개설 취소
#   학생의 기능 :  
#           수강신청 - 이중 등록 x, 인원이 가득차면 등록 불가
#           수강신청목록 조회 , 수강취소

class Student:
    def __init__(self, name=''):
        self.name = name
    def PrintInfo(self):
        print(self.name)

class StudentDao:
    def __init__(self, ObjList):
        self.ObjList = ObjList
    def addObj(self, o):
        self.ObjList.append(o)
    def selectObj(self, name):
        for i in self.ObjList:
            if i.name == name:
                return i
    def deleteObj(self, name):
        o = self.selectObj(name)
        if o == None:
            print('잘못된 과목명을 입력하였습니다.')
            return
        self.ObjList.remove(o)
    def selectAll(self):
        return self.ObjList
        
class StudentService:
    def __init__(self, ObjList=[]):
        self.dao = StudentDao(ObjList)
    def addObj(self):
        # Professor List에서 수강신청 인원이 꽉찼다면 신청실패
        self.dao.addObj(Student(input('name : ')))
    def ShowObj(self):
        objectList = self.dao.selectAll()
        for i in objectList:
            i.PrintInfo()
    def DeleteObj(self):
        self.dao.deleteObj(input('name : '))
    def ReturnList(self):
        return self.dao.selectAll()

def main(ObjList):
    service = StudentService(ObjList)
    select = 0
    while select != 6:
        select = int(input("1.add 2.delete 3.selectAll 6.exit\n"))
        if select == 1:
            service.addObj()
        elif select == 2:
            service.DeleteObj()
        elif select == 3:
            service.ShowObj()
        else:
            print("종료 합니다.")
            break
    return service.ReturnList()