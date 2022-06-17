from operator import indexOf


class Eredmeny:
    nev: str
    rajtszam: int
    kategoria: str
    ido: str
    tavSzazalek: int
    
    def __init__(self, sor: str) -> None:
        adatok = sor.split(';')
        self.nev = adatok[0]
        self.rajtszam = int(adatok[1])
        self.kategoria = adatok[2]
        self.ido = adatok[3]
        self.tavSzazalek = int(adatok[4])


#fájl megnyitas      
file = open('ub2017egyeni.txt', 'r', encoding ="utf_8")
file.readline()

osszesEredmeny = []
        
for sor in file:
    egyEredmeny = Eredmeny(sor.strip())
    osszesEredmeny.append(egyEredmeny)
    
print("a listaban",len(osszesEredmeny), "eredmény van")

#nok kiiratása
noidb = 0
for egyAdat in osszesEredmeny:
    if egyAdat.kategoria == "Noi" and egyAdat.tavSzazalek ==100:
        noidb = noidb + 1
print(noidb)


#sportolo ideje
ido = osszesEredmeny[0].ido.split(":")
oraban = (int(ido[0])*3600+ int(ido[1])*60 + int(ido[2]))/3600
print(oraban)  

def idoOraban(idoString:str)->float:   
    ido = idoString.split(":")
    ora = (int(ido[0])*3600+ int(ido[1])*60 + int(ido[2]))/3600
    return ora
print(idoOraban(osszesEredmeny[0].ido))

#teljes tavot teljesito ferfi sportolok átlagos ideje
osszeg = 0
ffidb = 0
for ferfi in osszesEredmeny:
    if ferfi.kategoria == "Ferfi" and ferfi.tavSzazalek ==100:
     ffidb = ffidb + 1
    osszeg = osszeg + idoOraban(egyAdat.ido)
print(ffidb," ",osszeg) 
print("a teljes ido",osszeg/ffidb,"óra")

#hany celba erkezet versenyzo van aki elotti es utani nem teljesitette a tavot
teljestav = 100 
darab = 0
for i in range(1,len(osszesEredmeny)-1):
    if osszesEredmeny[i].tavSzazalek == 100 and osszesEredmeny[i + 1 ].tavSzazalek < 100 and osszesEredmeny[i-1].tavSzazalek < 100:
        darab +=1
    

print(darab)

#7. Feladat
nev = input("Adj meg egy sportoló nevét:")

bennevane = False
for egyAdat in osszesEredmeny:
    if egyAdat.nev == nev:
        bennevane = True
        print("Szerepel")
        if egyAdat.tavSzazalek == 100:
            print("Végig ment")
        else: print("Nem Teljesitett")
if not bennevane:
    print("Nem indult")

