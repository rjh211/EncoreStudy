from cv2 import cv2 
import threading, datetime

def writeVideo():
    cap = cv2.VideoCapture(0)

    cap.set(3,320)
    cap.set(4,240)
    now = datetime.datetime.now()
    fourcc = cv2.VideoWriter_fourcc(*'xvid')
    out = cv2.VideoWriter('Encore/homework/Video/'+str(now.day)+'_'+str(now.hour)+'_'+str(now.minute)+'_'+str(now.second)+'.avi', fourcc, 25.0,(320,240))
    
    nextTime = now + datetime.timedelta(seconds=3)
    while True:
        ret, frame = cap.read()

        if ret:
            out.write(frame)
            cv2.imshow('Video', frame)
            cv2.waitKey(1)
            if int((nextTime - datetime.datetime.now()).total_seconds()) == 0:
                break
        else:
            break
    cap.release()
    out.release()
    threading.Timer(3, writeVideo).start()

def loadVideo():
    cap = cv2.VideoCapture('Encore\\homework\\Video\\out1.avi')

    while(cap.isOpened()):
        ret, frame = cap.read()

        if ret:
            cv2.imshow('video', frame)
            if cv2.waitKey(1) & 0xFF == ord('q'):
                break
        else:
            break
    cap.release()
    cv2.destroyAllWindows()
writeVideo()
loadVideo()