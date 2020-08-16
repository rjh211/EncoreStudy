import types
#클래스 : 객체를 표현
# ex_
# class 클래스명:
# '''클래스 설명'''                       # 클래스에 대한 설명이 document에서 나옴
# 변수 정의                               #클래스 변수로 정의가됨(java에서의 static 변수)


# 메서드 정의 
# def 메서드명(self, val)                 #첫번째 파라미터는 현재 객체를 받아옴
# 객체의 멤버변수 정의 및 실행 코드         #메서드 내부에서 멤버변수를 정의함

class Test:
    ''' 클래스 doc'''
    cnt = 0                                 #static 변수, class 변수
    def f1(self, val1, val2,val3):
        self.name = val1
        self.age = val2                     #Test class의 class변수, static 변수
        temp = val3                         #메서드내 지역변수로만 선언
        print(temp)
    def f2(self):
        print('name : ', self.name)
        print('age : ', self.age)
    def f3(self):
        print(type(self))

class Point:
    # def __init__(slef):
    #     pass
    def __init__(self, var1 = 0, var2 = 0):         #함수 오버로딩이 되지 않기댸문에 default값을 설정해두어야한다.
        self.x = var1
        self.y = var2
    def __del__(self):                              #소멸자 : 사용중이던 자원 해제를 주로함
        print("소멸")
    def printxy(self):
        print('x:', self.x)
        print('y:', self.y)

class private:                                      #private 데이터의 은닉성 __변수명
    __private = 0
    def __init__(self, x=0, y=0):
        self.x = x                                  #public
        self.__y = y                                #private
    def printxy(self):
        print('x:', self.x)
        print('__y:', self.__y)
    def sety(self, y):                              #캡슐화
        self.__y = y
    def gety(self):
        return self.__y


class nullClass:                                    #빈클래스: 실시간으로 데이터를 읽어오거나 데이터의 포맷이 자주 바뀌는 경우 빈 클래스로 만들었다가 추후에 멤버변수나 메서드를 추가하여 사용
    pass

class staticClass:                                  #정적 클래스 변수와 static(self가 없는) 메서드로만 구성된 클래스로 객체를 모델링 하는 것보다는 기능을 제공하기위한 클래스 ex_ java의 math 클래스
    count = 0                                       #멤버에 접근시 객체이름이 아닌 클래스 이름으로 접근 java와 동일
    __PI = 3.14
    PI = __PI                                       #private에 대한 getter를 만들어서 클래스 내의 메서드에서 사용하도록함

    @staticmethod
    def get_Area_Circle(r):
        return r*r*staticClass.PI

    @staticmethod
    def get_Area_Rect(w,h):
        return w*h

#내장 속성
# __doc__ : 클래스 설명 , 클래스 정의시 첫줄에 ''' '''로 작성
# __name__ : 클래스이름
# __module__ : 소속된 모듈명
# __bases__ : 현재 클래스가 상속받은 부모 클래스의 목록을 갖는 튜플
# __dict__ : 클래스 정보
class innerFuction():
    '''Test Class'''
    PI = 3.14
    def __init__(self, msg):
        self.msg = msg
    def printMem(self):
        print(self.msg)

    @staticmethod
    def staticMethod():
        print('정적 메서드')
        print('pi : ', innerFuction.PI)

def main1():
    t1 = Test()
    t1.f1('aaa', 12, 'temp')
    t1.f2()
    t1.f3()
    print(t1.__doc__)

def main2():
    p1= Point()
    p1.x = 10
    p1.y = 20
    p1.printxy()

    p2 = Point(1,2)
    p2.printxy()                             #생성자가 없을시에는 오류가 나게됨

    del p1
    del p2

def main3():
    t1 = private(3,4)
    t1.printxy()
    print('t1.x : ', t1.x)
    # print('t1.y : ', t1.__y)                #private이기때문에 읽어올수없음 error 발생
    t1.sety(3)                                  #캡슐화 사용
    print(t1.gety)

def main4():
    def f1():
        print('method : f1')
    def f2():
        print('method : f2')
    def f3(self):
        print(self.__dict__)                    #객체 구성요소 (멤버변수, 메서드)를 갖는 딕셔너리
        dic = self.__dict__
        for i in dic:
            if not isinstance(dic[i], types.FunctionType):          #types 모듈과 객체비교함수인 isinstance를 사용하여 함수인것을 제외하고 나머지 출력
                print(i , " : ", dic[i])
    obj = nullClass()
    obj.val1 = "aaa"                            #비어있는 class의 멤버변수를 선언
    obj.val2 = 12
    obj.method1 = f1                            #비어있는 class의 메서드 선언
    obj.method2 = f2
    obj.method3 = f3

    print('====obj=====')
    print('obj.val1 : ', obj.val1)
    print('obj.val2 : ', obj.val2)
    obj.method1()
    obj.method2()
    obj.method3(obj)

def main5():
    print("PI : ", staticClass.PI)
    print("원의 넓이 : ", staticClass.get_Area_Circle(5))
    print("사각형의 넓이 : ", staticClass.get_Area_Rect(5,4))

def main6():
    t1 = innerFuction('hello')
    t1.printMem()
    print('t1.__doc__',t1.__doc__)
    print('t1.__class__',t1.__class__)
    print('t1.__class__.__name__',t1.__class__.__name__)
    print('t1.__module__',t1.__module__)
    print('t1.__class__.__bases__',t1.__class__.__bases__)
    print('t1.__dict__',t1.__dict__)

    
    print('Test.__doc__',innerFuction.__doc__)
    # print('Test.__name__',innerFuction.__name__)
    # print('Test.__module__',innerFuction.__module__)
    # print('Test.__bases__',innerFuction.__bases__)
    print('Test.__dict__',innerFuction.__dict__)

val1 = 100
def main7():
    val1 = 200                              #f1 메서드의 지역변수
    print('f1 val' , val1)

    def f2():
        val1 = 300                          #f2 메서드의 지역변수
        print('f1 val' , val1)
    def f3():
        nonlocal val1                       #nonlocal : 현재 이함수의 지역변수가 아니라 바로 윗단계 함수의 변수 f1의 지역변수
        print('f1 val' , val1)
    def f4():
        global val1                         #global : 전역변수
        print('f1 val' , val1)

    f2()
    f3()
    f4()

main7()