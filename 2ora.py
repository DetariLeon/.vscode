#derkszögü háromszög
a = int(input("Add meg a háromszög'a' oldalát:"))
b = int(input("Add meg a háromszög'b' oldalát:"))
c = int(input("Add meg a háromszög'c' oldalát:"))


if  a*a+b*b==c*c: print("Ez egy derékszögű háromszög")
else: print("Ez nem egy derészögű háromszög")

#derékszög 2
if  pow(a, 2)+pow(b, 2)==pow(c, 2): print("Ez igy is egy derékszögű háromszög")
else: print("Ez nem egy derészögű háromszög")
