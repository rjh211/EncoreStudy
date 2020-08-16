str1 = "abcdefghijklmnopqrstuvwxyz"
f = open("e.txt","w")
f.write(str1)
f.close()

f = open("e.txt","rb")
print("현재위치 : ", f.tell())
print(f.read(1))

f.seek(5)
print("현재위치 : ", f.tell())
print(f.read(1))

f.seek(10,0)
print("현재위치 : ", f.tell())
print(f.read(1))

f.seek(-5,1)
print("현재위치 : ", f.tell())
print(f.read(1))

f.seek(5,1)
print("현재위치 : ", f.tell())
print(f.read(1))

f.seek(-3,2)
print("현재위치 : ", f.tell())
print(f.read(1))
print()
for i in range(25,-1,-1):
    f.seek(i)
    print(f.read(1))
    