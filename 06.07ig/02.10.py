#keszitsunk egy fuggvenyt ami egy parameterken meg kapott szoban meg hatarozza a maganhangzök számát
from xmlrpc.client import boolean
def prime(a: str) -> int:
    db: int = 0
    betuk= ("a","á","e","é","i","í","ö","ő","ü","ű","o","ó","u","ű")
    for i in range(len(a)):
        if a[i] in betuk:
            db+=1
            return db
print(prime("Hétfő"))
betuk= "a","á","e","é","i","í","ö","ő","ü","ű","o","ó","u","ű"
napok = ['hétfő', 'kedd', 'szerda','csütörtök','péntek']
for betuk in napok:
    print(prime(napok))

#melyik napban van a legtöbb maganyhangzo
maxhely=0
for i in range(len(napok)):
    if (prime(betuk[i]) > prime(napok[maxhely])):
        maxhely = i
print(napok[maxhely])