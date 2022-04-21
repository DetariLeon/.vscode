#kutya osztaly letrehozasa
class Kutya:
    nev: str
    fajta:str
    szulido: int

    def _init_(self,neve:str,fajtaja:str,szulideje:int) -> None:
        self.nev = "Bodri"
        self.fajta = fajtaja
        self.szulido= szulideje

    def ugat(self):
        print("Vau,vau...")
#kutya osztalyu objektumok letrehozasa -> 1 konkret kutya
enKutyam = Kutya("Bodri", "puli", 2020)
print("kutyam nev",enKutyam.nev)
print("Kora:",2022-enKutyam.szulido)

tekutyad = Kutya("Zeusz","német juhász", 2020)
print("Te kutyád", tekutyad.nev,",fajtája",tekutyad.fajta,"és születési éve", tekutyad.szulido)

#a Kutya osztaly metodusanak hivasa
enKutyam.ugat()