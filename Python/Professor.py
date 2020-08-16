# 1. 학생 , 2.교수 3. 교직원
# 1) 교직원이 과목 등록 -> 과목코드, 과목명
#   교직원의 기능 : 과목등록/ 과목 리스트 출력
#   교수의 기능 :   
#           과목개설 / 교직원이 등록한 과목중 개설이되지 않은 과목을 선택하여 개설(개설 유무 값이 필요) -> 요일/시간, 강의실, 학점, 인원수, 과목개요
#           내가 개설한 과목 조회, 개설 취소
#   학생의 기능 :  
#           수강신청 - 이중 등록 x, 인원이 가득차면 등록 불가
#           수강신청목록 조회 , 수강취소

class Professor:
    def __init__(self,name = '', date = '', roomNo = '', score = '', peopleNo = '', comm = ''):
        self.name = name
        self.date = date
        self.roomNo = roomNo
        self.score = score
        self.peopleNo = peopleNo
        self.comm = comm
    def PrintInfo(self):
        print(self.name, ' / ', self.date , ' / ',self.roomNo , ' / ',self.score , ' / ',self.peopleNo , ' / ',self.comm )

class ProfessorDao:
    def __init__(self,objList = [], managerList = []):
        self.managerList = managerList
        self.ObjList = objList
    def addObj(self, p):
        for o in self.managerList:
            if o.objName == p.name and o.isAccepted == False:
                self.ObjList.append(p)
                o.isAccepted = True
                return
        print('잘못된 과목명입니다.')
    def selectObj(self, name):
        for o in self.ObjList:
            if o.name == name:
                return o
    def delete(self, name):
        o = self.selectObj(name)
        if o == None:
            print("과목명 입력 오류")
            return
        self.ObjList.remove(o)
        for o in self.managerList:
            if o.objName == name: 
                o.isAccepted = False
    def update(self, p):
        o = self.selectObj(p.name)
        if o== None:
            print("과목명 입력 오류")
            return
        o.date, o.roomNo,o.score, o.peopleNo, o.comm = p.date, p.roomNo, p.score, p.peopleNo, p.comm
    def selectAll(self):
        return self.ObjList

class ProfessorService:
    def __init__(self, objList, ManagerList):
        self.dao = ProfessorDao(objList, ManagerList)
    def addObj(self):
        self.dao.addObj(Professor(input('name : '), input('date : '), input('room Number : '), input('Score : '), input('People number : '), input('Comment : ')))
    def showObj(self):
        objList = self.dao.selectAll()
        for i in objList:
            i.PrintInfo()
    def delObj(self):
        self.dao.delete(input('name : '))
    def ReturnList(self):
        return self.dao.selectAll()

def main(objList, ManagerList):
    service = ProfessorService(objList, ManagerList)
    select = 0
    while select != 6:
        select = int(input("1.add 2.delete 3.selectAll 6.exit\n"))
        if select == 1:
            service.addObj()
        elif select == 2:
            service.delObj()
        elif select == 3:
            service.showObj()
        else:
            print("종료 합니다.")
            break
    return service.ReturnList()