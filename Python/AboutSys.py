import sys
def main():
    sin = sys.stdin
    sout = sys.stdout
    serr = sys.stderr

    num = sout.write('문자 를 입력하시오 : ')
    sout.write("wirete()가 출력한 문자수 = "+ str(num) + "\n")

    str1 = sin.read(3)
    sout.write("str1 = " + str1 + "\n")
    str2 = sin.readline()
    sout.write("str2 = " + str2 + "\n")
    str3 = sin.read()
    sout.write("str3 = " + str3 + "\n")

    sout.write("write()가 출력한 문자수 " + str(num) + "\n")

    serr.write("sys.stderr :  에러 메세지 출력")

main()
