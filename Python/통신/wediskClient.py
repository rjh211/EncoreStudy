import os
import socket


def mk_dir():
    if not os.path.isdir('refs'):
        os.mkdir('refs')


def dir_list(d):
    return os.listdir(d)


def up(soc):
    f_dir = input('업로드할 파일이 속한 폴더명을 입력하세요.\n')
    f_list = dir_list(f_dir)
    for idx, f in enumerate(f_list):
        print(idx, ',\t', f)

    num = 1
    while num < 0 or num >= len(f_list):
        num = int(input('업로드할 파일 번호 입력'))
        f_name = f_list[num]
        f = open(f_name, 'r', encoding='utf-8')
        body = f.read()
        f.close()
        soc.sendall(f_name.encode())
        soc.sendall(body.encode())

def download(soc):
    stopString = ''
    while stopString != '/stop':
        data = soc.recv(1024)
        stopString = data.decode()
        print(stopString)

    print('다운로드할 파일명을 입력하세요.')
    file_name = input()
    soc.sendall(file_name.encode())
    f = open('refs\\'+file_name,'w')
    file_str = soc.recv(1024)
    f.write(file_str.decode() + '\n')
    f.close()

def main():
    mk_dir()
    Host = 'localhost'
    Port = 9999
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((Host, Port))
    # soc = socket
    while True:
        menu = int(input('1.upload 2.download 3.stop'))
        if menu == 1:
            client_socket.sendall('up'.encode())
            up(client_socket)
        elif menu == 2:
            client_socket.sendall('download'.encode())
            download(client_socket)
        elif menu == 3:
            break

    client_socket.close()

main()