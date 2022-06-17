#fájl megnyitása 
file = open('orvosi_nobeldijak.txt','r',encoding='utf_8')

#lista létrehozása a sorok számára
lista = []

#első sor beolvasása (fejléc, nem csinálunk vele semmit)
file.readline()
print("1.Feladat")
#fájl soraink bejárása
for sor in file:
    #listához hozzáűfűzöm a listává szétdarabolt sort
    lista.append(sor.strip().split(";"))
print(lista)
print(lista[1][3])

#hány angol nobeldijjas van
print("2.Feladat")
gb = 0 
for sor in lista:
    if sor[3] == "GB":
        gb = gb+1
print(gb)

#kik azok akik 1920 elött Nobel dijat (csak név)
print("3.Feladat")
for sor in lista:
    if int(sor[0])<1905 : 
        print(sor[1])

#A-val kezdő nevek
print("4.Feladat")
for sor in lista:
    if sor[1][0] == "A":
        print(sor[1])
#akik meg elnek hany evesek
print("5.Feladat")
for sor in lista:
    if len(sor[2]) == 5:
        szulev = int(sor[2][1:4])
        print(sor[1],2022-szulev)
