file = open("haromszog1.txt","r")
print(file.read())
file.seek(0,0)
file.readline()
print(file.readline())
list = []
list.append(file.readline())
print(list)
file.seek(0,0)
a = (file.readline().split())
print(a)
print(max(a))
print(a[1])
file1 = open("ki.txt","w")
file1.write(a[1])
file.seek(0,0)
for i in range(4):
    print(file.readline())