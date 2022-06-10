f = open("legmagasabb.txt", "r", encoding="utf8()")
osszeredmeny = []

class Épület:
    nev: str
    varos: str
    orszag: str
    magassag: int
    emelet: int
    epult: int
    
    def __init__(self, sor: str) -> None:
        adatok = sor.split(";")
        self.nev = adatok[0]
        self.varos = adatok[1]
        self.orszag = adatok[2]
        self.magassag = adatok[3]
        self.emelet = adatok[4]
        self.epult = adatok[5]

for i in f:
    egyEredmeny = Épület(i.strip())
    osszeredmeny.append(egyEredmeny)

for a in osszeredmeny:
    print(a.nev)