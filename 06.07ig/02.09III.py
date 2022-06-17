from xmlrpc.client import boolean
from random import*
lista = []


def prime(szam: int) -> boolean:
    osztok = 0
    for i in range(szam):
        if szam%(i+1) == 0:
             osztok = osztok + 1
    return osztok == 2

#lista létretozás

for a in range(10):
    lista.append(randint(10,99))
    print(lista[a])

#eldöntöm hogy a listában van-e prímszám 
lista2= False
for x in range(10):
    print(prime(lista[x]))
    lista2 = True
if lista2 == True:
    print("Van benne prím")
else:
    print("nincs benne prím")
#V2
primdb = 0
for i in range(10):
    if(prime(lista[i])):
        primdb = primdb + 1
if primdb > 0:
      print("Van benne prím")
else:
    print("nincs benne prím")