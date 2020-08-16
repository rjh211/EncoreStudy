import tkinter as tk
import socket,threading


def main():
    client_socket = None
    Host = None
    port = None
    def Connect():
        global Host, port,client_socket
        HOST = Host  
        PORT = port       
        
        client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

        client_socket.connect((HOST, PORT))
        print("연결 성공")
        

    def SetHost(ev):
        global Host
        Host = H.get()
    def SetPort(ev):
        global port
        port = int(P.get())
    def SendMsg(ev):
        global client_socket
        msg = Msg.get().encode()
        client_socket.sendall(msg)
        Msg.delete(0,len(msg))
        data = repr(client_socket.recv(1024).decode())
        test = label["text"] +'\n'+ data
        label.config(text = test)
    def Close(ev):
        client_socket.close()
        
    root = tk.Tk()

    root.title('chatting room')
    root.geometry("400x500")
    frm = tk.Frame(root)


    label = tk.Label(root, text = '', relief = 'groove', borderwidth = 1, padx = 400, pady = 150)
    # label2 = tk.Label(root, text = '', relief='groove', borderwidth = 1, padx = 100, pady = 5)
    H = tk.Entry(root,width = 50)
    P = tk.Entry(root,width = 50)
    Msg = tk.Entry(root,width = 100)

    btn = tk.Button(root, text="connect", command = Connect)
    btnClose = tk.Button(root, text="disconnect", command = Close)

    H.pack()
    P.pack()
    Msg.pack()
    frm.pack()
    label.pack()
    #label2.pack()
    btn.pack()
    btnClose.pack()

    H.bind('<Return>', SetHost)
    P.bind('<Return>', SetPort)
    Msg.bind('<Return>', SendMsg)
    root.mainloop()
