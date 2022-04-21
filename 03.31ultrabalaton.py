file = open("ub2017egyeni.txt", "r")
file.readline()

class eredmeny:
    nev: str
    Rajtszam: int
    kategoria: str
    ido: str
    tavSzazalek: int
    
    def __init__(self, sor: str) -> None:
        adatok = sor.split(";")
        self.Nev = adatok[0]
        self.Rajtszam = int(adatok[1])
        self.kategoria = adatok[2]
        self.Elertido = adatok[3]
        self.tavSzazalek = adatok[4]
noidb = 0
minszazalek = 100
for sor in file:
    egyAdat = eredmeny(sor)
    print("Neve: ",egyAdat.nev, " ideje: ", egyAdat.ido)
    if egyAdat.kategoria == "Noi":
        noiDb = noiDb + 1
    if egyAdat.tavSzazalek < minSzazalek:
        minSzazalek = egyAdat.tavSzazalek
    
    
print(noidb)
print(minSzazalek)
noiDb = 0
minSzazalek = 100

file.readline()

        