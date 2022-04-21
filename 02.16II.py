from xmlrpc.client import boolean
ev = int(input("Év:"))
def nap(ev) -> boolean:
    return ev % 400 == 0 or ev % 100 == 0 and ev % 4 == 0
print(nap(ev))

db = 0 
a = int(input("1 évszám:"))
b = int(input("2 évszám:"))
lista = []
for i in range(a,b + 1):
    if nap(i):
        print(i)
        db = db + 1 
if (db == 0 ):
    print ( "nem volt szökőév")
    

