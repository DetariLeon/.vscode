from math import*
from xmlrpc.client import boolean
#fuggveny:r sugarbol es m magassagbol kiszámolja a kup térfogatat
r = int(input("Sugár:"))
M = int(input("Magasság:"))
def kup(r, M):
    v= ((r*r) * pi * M) /3
    return v
print(kup(r,M))

ev = int(input("Év:"))
def nap(ev) -> boolean:
    return ev % 400 == 0 or ev % 100 == 0 and ev % 4 == 0
print(nap(ev))
       

