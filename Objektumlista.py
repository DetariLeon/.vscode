f1 = open("orvosi_nobeldijak.txt", "r", encoding="utf8()")
f1.readline()

class orvosi_nobel:
    ev: int
    nev: str
    szulhal: str
    orszagkod: str
    
    
    
    def __init__(self, sor: str) -> None:
        adatok = sor.split(";")
        self.ev = int(adatok[0])
        self.nev = adatok[1]
        self.szulhal = adatok[2]
        self.orszagkod = adatok[3]


osszesnobeldij: list[orvosi_nobel] = []

for a in f1:
    egyember = orvosi_nobel(a.strip())
    osszesnobeldij.append(egyember)
    
print(osszesnobeldij[10].nev)

for a in range(len(osszesnobeldij)):
    print(osszesnobeldij[a].nev)

for b in osszesnobeldij:
    print(b.ev)
    

  