import os
import socket
import threading


def mk_dir():
    if not os.path.isdir('refs'):
        os.mkdir('refs')


def dir_list():
    return os.listdir('refs')


def upload(soc):
    data = soc.recv(1024)
    f_name = data.decode()
    f_list = dir_list()
    for f in f_list:
        if f_name == f:
            s = f_name.split('.')
            f_name = s[0] + str(1) + s[1]
    f = open('refs/' + f_name, 'w')
    data = soc.recv(1024)
    body = data.decode()
    f.write(body)
    f.close()

def download(soc):
    f_list = dir_list()
    for i in f_list:
        soc.sendall(i.encode())
    else:
        soc.sendall('/stop'.encode())
    data = soc.recv(1024)
    f = open('C:\\Users\\JH\\Desktop\\Python\\refs\\'+data.decode(), 'r', encoding='utf-8')
    body = f.read()
    f.close()
    soc.sendall(body.encode())

def main():
    Host = 'localhost'
    port = 9999
    server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    server_socket.bind((Host, port))
    server_socket.listen()

    client_socket, addr = server_socket.accept()
    print(addr)
    while True:

        data = client_socket.recv(1024)
        menu = data.decode()
        if menu == 'up':
            upload(client_socket)
        elif menu == 'download':
            download(client_socket)
        elif menu == 'stop':
            break
    client_socket.close()
    server_socket.close()


main()
