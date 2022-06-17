osszeredmeny = []
egyAdat = []
nyulak = 0
file = open("focista.txt", "r", encoding="utf8()")
file.readline()
class foci:
    fordulo: int
    hfordulo: int
    vfordulo: int
    hfelidogol: int    
    vfelidogol: int
    hcsapat: str
    vcsapat: str
    
    def __init__(self, sor: str) -> None:
        adatok = sor.split(" ")
        self.fordulo = int(adatok[0])
        self.hfordulo = int(adatok[1])
        self.vfordulo = int(adatok[2])
        self.hfelidogol = int(adatok[3])
        self.vfelidogol = int(adatok[4])
        self.hcsapat = adatok[5]
        self.vcsapat = adatok[6]
        
for sor in file:
    egyeredmeny = foci(sor.strip())
    osszeredmeny.append(egyeredmeny)
    
print(f"A lista hossza: {len(osszeredmeny)}")

keresettFordulo=input("Sorszám 1-20:")
for egyAdat in osszeredmeny:
    if egyAdat.fordulo == keresettFordulo:
        print(egyAdat.hcsapat,"-",egyAdat.vcsapat)
        
nev = input("Adj meg egy csapat nevet:")
for i in osszeredmeny:
    if i.hcsapat == nev or i.vcsapat == nev :
        print(f"{nev} nevű csapat van a listaban.")
        break
    print(f"{nev} nincsen")
    break
  
#Tanarno megoldasasz

nev = input("Adj meg egy csapat nevet:")
vane = False
for i in osszeredmeny:
    if i.hcsapat == nev or i.vcsapat == nev :
        vane = True 
if(vane):
    print("Van")
else:
    print("nincs")
  
for eredmeny in osszeredmeny:
    if eredmeny.hcsapat and eredmeny.vcsapat == "Nyulak":
        nyulak += eredmeny.vfordulo
print(nyulak)        
        
        
        
def forditas(a:int, b:int, c:int, d:int)->bool:
    return(c>d and b>a) or (d > c and a>b)

