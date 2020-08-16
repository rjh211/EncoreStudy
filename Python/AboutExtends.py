# 상속
# class 클래스명(상속 클래스명1, 상속 클래스명2): #다중 상속 가능
#   클래스 정의

class Parents:
    def __init__(self):
        print('부모생성자')
        self.name = 'parent'
        self.age = 34
    def sayPrent(self):
        print('parent method')
    def printInfo(self):
        print('name:', self.name)
        print('age:', self.age)
class Child(Parents):
    def __init__(self):
        super().__init__()
        print('자식 생성자')
        self.hobby = '놀기'
        
    def sayChild(self):
        print('child method')
    def printInfo(self):
        super().printInfo()         #self.printInfo()호출시 자신의 printinfo출력 (overloading) ,  이름이 다르다면 self.printInfo2()와 같이 실행가능
        print('name:', self.name)
        print('age:', self.age)
        print('hobby:', self.hobby)

# class GrandChild(Parents, Child):   #child에서 이미 parent를 상속받앗으므로 parents 상속 불가능
#     def __init__(self):
#         print('test')

class Parents1():
    test = 1
    def __init__(self, x =1 , y = 1):
        self.x = x
        self.y = y
    def printxy(self):
        print('(',self.x,',',self.y,')')
class Child1(Parents1):
    def __init__(self,z):
        Parents1.__init__(self)                         #부모의 클래스를 직접 거론하여 메서드 호출시 self를 args로 넣어줘야함
        # super().__init__()
        self.z = z
    def printxyz(self):
        print('(',self.x,',',self.y,',',self.z,')')
        print(self.test)                                #Parent1 class의 클래스변수로 선언하였기떄문에 init을 실행하지 않아도 test값은 남아있다

class AClass():
    def __init__(self):
        print("AClass")
        super().__init__()          #D클래스의 다음 상속인 BClass의 생성자 호출
class BClass():
    def __init__(self):
        print("BClass")
class CClass():
    def __init__(self):             #B클래스에서 Super를 사용해주지 않으면 호출되지 않음
        print("CClass")
class DClass(AClass, BClass, CClass):   #상속 순서가 중요해짐
    def __init__(self):
        super().__init__()          #상속 클래스중 가장 왼쪽의 AClass 생성자 호출


def main():
    child = Child()
    parent = Parents()

    child.printInfo()
    print()
    parent.printInfo()

# main()

def main1():
    p = Parents1(1,2)
    p.printxy()

    c = Child1(5)
    c.printxyz()

#main1()

def main2():
    d = DClass()        #다중 상속시 상위 클래스 호출순서
    print(d)

main2()