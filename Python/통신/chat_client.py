import socket, threading

def th_input(soc):
    while True:
        msg = input('msg:')
        soc.sendall(msg.encode())
        if msg=='/stop':
            break
    print('키보드 입력 쓰레드 종료')
    
def th_read(soc):
    while True:
        data = soc.recv(1024)
        msg = data.decode()
        print(msg)
        if msg=='/stop':
            break
    print('서버 메시지 출력 쓰레드 종료')

def main():
    HOST = '192.168.103.59'  
    PORT = 9999

    #통신할 소켓 오픈 
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    #서버에 연결요청. server ip, port
    client_socket.connect((HOST, PORT))

    t1 = threading.Thread(target=th_input, args=(client_socket,))
    t1.start()
    t2 = threading.Thread(target=th_read, args=(client_socket,))
    t2.start()

    #client_socket.close()

main()
