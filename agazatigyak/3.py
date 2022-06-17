from tkinter import N


file = open("agazatigyak/jarmu.txt",'r')
jarmu = []

class jarmu:
    ora : int
    perc: int
    masodperc: int
    rendszam : str
    def _init_(self,sor:str)-> None:
        self.ora=int([0])
        self.perc=int([1])
        self.masodperc=int([2])
        self.rendszam = int([9])

for sor in file:
    egyeredmeny = jarmu(sor)
    jarmu.append(egyeredmeny)
print(len(jarmu))
    