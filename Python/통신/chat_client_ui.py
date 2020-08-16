import socket, threading
import tkinter as tk

client_socket = None
label = None
Msg = None
root = None
def send():
    global client_socket
    
    msg = Msg.get()
    client_socket.sendall(msg.encode())

def th_read():
    global client_socket
    while True:
        data = client_socket.recv(1024)
        msg = data.decode()
        #print(msg)
        
        label.configure(text=label.cget('text')+'\n'+msg)
        if msg=='/stop':
            break
        
    print('서버 메시지 출력 쓰레드 종료')
    
def ui_init():
    global label
    global Msg
    global root
    root = tk.Tk()

    root.title('chatting room')
    root.geometry("400x400")
    frm = tk.Frame(root)


    label = tk.Label(root, text = '', relief = 'groove', borderwidth = 1, padx = 400, pady = 150)
    Msg = tk.Entry(root,width = 100)

    btn = tk.Button(root, text="send", command = send)
    
    Msg.pack()
    frm.pack()
    label.pack()   
    btn.pack()
    
    

def main():
    global root
    global client_socket
    
    HOST = '192.168.103.59'  
    PORT = 9999

    #통신할 소켓 오픈 
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    #서버에 연결요청. server ip, port
    client_socket.connect((HOST, PORT))

    ui_init()
    
    t2 = threading.Thread(target=th_read, args=())
    t2.start()

    root.mainloop()
    #client_socket.close()

main()
