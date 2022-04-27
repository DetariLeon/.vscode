
class Elado:
    elso : int
    masodik : int
    harmadik : int

    def __init__(self, sor: str) -> None:
        adatok = sor.split(" ")
        self.elso = int(adatok[0])
        self.masodik = int(adatok[1])
        self.harmadik = int(adatok[2])
    
file = open("eladott",'r')
file.readline()

lista = []
