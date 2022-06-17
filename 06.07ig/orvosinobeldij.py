#osztaly letrehozas
class Nobeldijasok:
    ev: int
    nev: str
    szulHal: str
    orszag: str
    
    
    def __init__(self, sor: str) -> None:
        adatok = sor.split(";")
        self.ev = int(adatok[0])
        self.nev = adatok[1]
        self.szulHal = adatok[2]
        self.orszag = adatok[3]
        
#fajl megnyitas

file = open('orvosi_nobeldijak.txt','r', encoding="utf8()")
file.readline()
nobdijasok= 0
#hany nobel dijas van?
for i in file:
    nobdijasok += 1
print(nobdijasok)

file.seek(0)
file.readline()
magyar = 0

#hany magyar van?
for a in file:
    adatok = Nobeldijasok(a)
    if adatok.orszag.strip() == "H":
        magyar += 1
print("Magyar Nobel szama:",magyar)

file.seek(0)
file.readline()
eslonob = 2022
for b in file:
    elso = Nobeldijasok(b.strip())
    if (elso.ev < eslonob):
        eslonob = elso.ev
print("Az első orvosi nobeldij:",eslonob)

file.seek(0)
file.readline()
szerepele = False
for x in file:
    egyNber = Nobeldijasok(x.strip())
    if ("Archibald" in egyNber.nev):
        szerepele = True
if (szerepele):
    print("Szerepel")
else:
    print("Nem szerepel")
    
file.seek(0)
file.readline()

for sor in file:
    egyEmber = Nobeldijasok(sor.strip())
    evek = egyEmber.szulHal.split("-")
    if(evek[1] != ""):
        print(egyEmber.nev,":",int(evek[1])-int(evek[0]))