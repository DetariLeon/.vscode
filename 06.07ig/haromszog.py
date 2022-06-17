file = open("haromszog1.txt", "r")
file.readline()
file2 = open("haromszog1.txt", "r")
file2.readline()

def haromszoge(a:int, b:int, c:int):
    return a + b > c and a + c > b and c + b > a

def haromoszt(a:int, b:int, c:int):
    if a % 3 != 0 and b % 3 != 0 and c % 3 != 0:
        print(a, b, c)
        return True
    return False
    

xy = file2.readline().split()
for a in file:
    print(f"Lehet háromszög? {haromszoge(int(xy[0]), int(xy[1]), int(xy[2]))}")
    print(f"3mal oszthato {haromoszt(int(xy[0]), int(xy[1]), int(xy[2]))}\n")
    xy = file2.readline().split()
    