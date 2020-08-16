# import os
# os.getwd()    - 현재위치 이름을 문자열로 반환
# os.chdir(path)    - 작업 디렉토리 path로 이동 -> os.chdir('../') 상위 디렉토리로 이동
# os.mkdir(path)    -디렉토리 생성
# os.mkdir(path, mode)  -읽기, 쓰기, 실행하기 권한 부여 (user group other 에대한 권한을 0~8까지로 표현 0 -> 000 , 8->111 )
# os.rmdir(path)    - path 디렉토리 삭제
# os.listdir(path)  - path 디렉토리에 있는 파일 목록을 리스트에 담아서 반환
# os.path.isfile(path)  - path의 파일 존재 유무를 T,F로 반환
# os.path.isdir(path)   - path의 다렉토리 존재 유무를 T,F로 반환
import os

def main():
    print("현재 작업 디렉토리 : ", os.getcwd())
    new_dir = input("생성할 dir 입력 하시오 : ")
    os.mkdir(new_dir)
    print(new_dir, "디렉토리 생성")
    print(new_dir, "exist?", os.path.isdir(new_dir))
    os.chdir(new_dir)
    print(new_dir,"로 디렉토리 이동")
    print("현재 디렉토리 : ", os.getcwd())

    list1 = ["a.txt","b.txt","c.txt"]
    for f_name in list1:
        f = open(f_name, "w")
        print(f_name, "파일 생성, 내용으로 파일명 작성")
        f.write(f_name)
        f.close()
    os.chdir("../")
    print("상위 디렉토리로 이동")
    print("현재 작업 디렉토리", os.getcwd())

    files = os.listdir(new_dir)
    print(new_dir, "디렉토리의 파일 목록")
    for f_name in files:
        f = open(new_dir+"/"+f_name,"r")
        print(f_name, "(contents : ", f.read(),")")
        f.close()
def main2():
    def readDir(path):
        os.chdir(path)
        print(os.getcwd())
        files = os.listdir('./')
        print('파일 목록')
        for f in files:
            if os.path.isfile(f):
                print(f)
            else:
                readDir(f)
        os.chdir('../')
    d = input('디렉토리 생성 경로를 작성하시오.')
    if os.path.isdir(d):
        readDir(d)
    else:
        print("잘못된 디렉토리 경로")

main2()
# main()