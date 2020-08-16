# 1. 학생 , 2.교수 3. 교직원
# 1) 교직원이 과목 등록 -> 과목코드, 과목명
#   교직원의 기능 : 과목등록/ 과목 리스트 출력
#   교수의 기능 :   
#           과목개설 / 교직원이 등록한 과목중 개설이되지 않은 과목을 선택하여 개설(개설 유무 값이 필요) -> 요일/시간, 강의실, 학점, 인원수, 과목개요
#           내가 개설한 과목 조회, 개설 취소
#   학생의 기능 :  
#           수강신청 - 이중 등록 x, 인원이 가득차면 등록 불가
#           수강신청목록 조회 , 수강취소

class Manager:
    def __init__(self , objCode = '', objName = ''):
        self.objCode = objCode
        self.objName = objName
        self.isAccepted = False
    def PrintInfo(self):
        print(self.objCode, ' / ',self.objName, ' / ',self.isAccepted)

class ManagerDao:
    def __init__(self,ObjList=[]):
        self.ObjList = ObjList
    def addObj(self, o):
        self.ObjList.append(o)
    def selectObj(self,objCode):
        for i in self.ObjList:
            if i.objCode == objCode:
                return i
    def removeObj(self, objCode):
        o = self.selectObj(objCode)       
        if o == None: 
            print('잘못된 코드입니다.')
            return
        self.ObjList.remove(o)
    def updateObj(self, Manager):
        o = self.selectObj(Manager.objCode)       
        if o == None: 
            print('잘못된 코드입니다.')
            return
        o.objName = Manager.objName
    def selectAll(self):
        return self.ObjList

class ManagerService :
    def __init__(self, ObjList):
        self.dao = ManagerDao(ObjList)
    def addObject(self):
        self.dao.addObj(Manager(input('input objCode : '), input('input objName : ')))
    def selectObj(self):
        self.dao.selectObj(input('input objCode : ')).PrintInfo()
    def selectAll(self):
        obj = self.dao.selectAll()
        for i in obj:
            i.PrintInfo()
    def returnList(self):
        return self.dao.selectAll()

def main(ObjList):
    service = ManagerService(ObjList)
    select = 0
    while select != 6:
        select = int(input("1.add 2.select 3.selectAll 6.exit\n"))
        if select == 1:
            service.addObject()
        elif select == 2:
            service.selectObj()
        elif select == 3:
            service.selectAll()
        else:
            print("종료 합니다.")
            break
    return service.returnList()