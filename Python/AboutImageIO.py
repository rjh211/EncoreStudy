#이미지 (파일)복사
def copy(n1,n2):
    f1 = open(n1,'rb')
    data = f1.read()
    f2 = open(n2, 'wb')
    f2.write(data)
    f1.close()
    f2.close()

def main():
    f_name1 = 'a.png'
    f_name2 = 'b.png'
    copy(f_name1,f_name2)

main()