import math
#Feladat:. 3 bekért számról döntsük el, hogy háromszög e
a = int(input("Add meg a háromszög'a' oldalát:"))
b = int(input("Add meg a háromszög'b' oldalát:"))
c = int(input("Add meg a háromszög'c' oldalát:"))

if a<b+c and b<a+c and c<a+b:
     print ("Ez egy háromszög") 
     print ("Kerület=",a+b+c)
     s=(a+b+c)/2
     T=math.sqrt(s*(s-a)*(s-b)*(s-c))
     print("Terület=", T)
else: print("Ez nem egy háromszög")
