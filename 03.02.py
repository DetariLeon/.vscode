#kerjunk be a felhasznalotol ketto mondatot 
mondat1=input("Irjál be egy mondatot:")
mondat2=input("Irjál be egy mondatot:")
#melyik hosszab
if mondat1 > mondat2:
    print("A",mondat1,"hosszabb")
else:
    print("A",mondat2,"hosszabb")
#igaz e hogy pontra vegzodik
print(mondat1.endswith("."))
print(mondat2.endswith("."))
#igaz e hogy mind 2 mondat nagybetuvel kezdodik
print("mindkettő mondat nagybetuvel kezdödik?",mondat1.istitle() and mondat2.istitle())
    