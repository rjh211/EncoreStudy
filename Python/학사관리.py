import Professor, Student, Manager
ProfessorList = []
StudentList = []
ManagerList = []
def main():
    global ProfessorList,StudentList, ManagerList
    select = 0
    while select != 6:
        select = int(input("1.Professor 2.Manager 3.Student 6.exit\n"))
        if select == 1:
            Professor.main(ProfessorList, ManagerList)
        elif select == 2:
            Manager.main(ManagerList)
        elif select == 3:
            Student.main(StudentList)
        else:
            print("종료 합니다.")
            break
main()