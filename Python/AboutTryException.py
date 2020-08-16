#예외처리
# 프로그램이 어떤 요인에 의해서 중단되는 것을 막는다.
def main():
    try:
        num = int(input())
        a = 4/num
        lst = [0,1]
        b = lst[num]
        print(a,b)
    except ZeroDivisionError:           #발생할 예외 클래스를 알고있을때
        print('0으로 나눌수없음')       
    except:                             #예외 발생시 클래스 지정을 안한 예외들을 처리
        print("예상치 못한 예외 발생")
    else:                               #예외가 발생하지 않았을경우
        print('예외가 발생하지 않음')
    finally:                            #무조건 실행되는 블럭
        print('end')
# main()

#예외 발생
# raise 예외명

def main2():
    def add_int(a,b):
        if not isinstance(a, int): #객체간 비교
            raise TypeError("int type만 연산 가능")
        if not isinstance(b,int):
            raise TypeError("int type만 연산가능")
        return a+b
    
    try:
        result = add_int(2,4)
        print("result : ", result)

        result = add_int(2,"4")
        print("result : ", result)

    except TypeError as o:
        print(o)
    except :
        print("예상치 못한 에러")
# main2()

class MyError(Exception):       #exception 클래스 상속
    def __init__(self, msg, msg2):    # 생성자    python method의 첫번재 param은 this이다. #  메서드
        super().__init__('msg')       #멤버 변수
       # a = 1234                #지역 변수
    #예외 클래스의 tostring은 Exception클래스의 msg 멤버 변수를 출력하게되어있음 super().__init__(msg)를 통해 출력할 메세지 변경 
    # super()생성자 미호출시 2번째 이상의 parameter를 출력함
def main3():        #함수
    try:
        raise MyError("occur my error","test") #python은 new로 생성하지 않아도 된다.
        # print("예외발생에 의해 이문장은 실행되지않음")
    except MyError as e:
        print(e)
    print("프로그램은 중단되지 않는다.")

main3()