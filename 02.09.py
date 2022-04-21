#kérjünk be három szamot és térolja el majd irja ki hogy melyik nagyobb melyik kisebb és melyik a középső
a = int(input("Első szám:"))
b = int(input("második szám:"))
c = int(input("harmadik szám:"))
maximum = max(a,b,c)
minimum = min(a,b,c)
if (a != maximum and a != minimum):
    medium = a
if (b != maximum and b != minimum):
    medium = b
else:
    medium = c
print(minimum,maximum,medium)

#más megoldas
lista = [a,b,c]
lista.sort()
print("legkisebb:", lista[0], "középső: ", lista[1], "legnagyobb:",lista[2])
