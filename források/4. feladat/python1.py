#2. Szökőévek
from xmlrpc.client import boolean
print("2. feladat: Szökőév listázó")
evtolev= [] # Az összes év a kettő között
szokoevek = []
def szokoev(ev: int) -> boolean:
    if ev % 400 == 0 or ev % 4 == 0 and (ev % 100) != 0:
        return True
    return False

a = int(input("Kérem az egyik évszámot: "))
b = int(input("Kérem a másik évszámot: "))

evtolev.append(a)
for i in range(b - a):
    evtolev.append(a + (i + 1))
    
for a in evtolev:
    if szokoev(a):
        szokoevek.append(a)

if len(szokoevek) > 0:
    print("Szökőévek: ", *szokoevek)
else:
    print("Nincs szökőév a megadott tartományban.")