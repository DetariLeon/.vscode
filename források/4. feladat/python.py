#1. Kisebb-nagyobb meghatározása
#1. feladat
print("1. feladat: Kisebb-nagyobb meghatározása")
a = int(input("Kérem az élső számot: "))
b = int(input("Kérem a második számot: "))
if a < b:
    print(f"A nagyobb szám: {b}, a kisebb {a}")
elif a > b:
    print(f"A nagyobb szám: {a}, a kisebb {b}")
elif a == b:
    print("A két szám egyenlő.")
