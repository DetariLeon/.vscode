#2.     
#feladat
#Kérjen be a program pozitív egész számokat a felhasználótól
#addig, amig negatív számot nem ad meg.
#Tároljuk el a számokat.
#Készítsünk egy függvényt, ami megadja, hogy melyik a
#legkisebb páratlan szám a listában!
#Ezen kívül írja ki a program, hogy hány eleme van a
#listának.
from xmlrpc.client import boolean


lista = []
a = 0 
while a > -1:
    a = int(input("Adj meg egy számot:"))
    lista.append(a)
print(lista)

def paratlan(szamok)->int:
    lk=szamok[0]
    for i in szamok:
        if i < lk and i%2 == 0:
            lk = i
    return i




b = min(lista)
if b%2:
    print(min(lista))
else:
    print("Nincs")


print(len(lista))

        