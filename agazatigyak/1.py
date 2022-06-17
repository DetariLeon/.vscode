#1.     
#feladat
#Kérjen be a program a felhasználótól egy szót. Ha a szóban
#van ’a’ betű, írja ki:
#A(z) alma szó tartalmaz ’a’ betűt.
#egyébként írja ki:
#A(z) körte szó nem tartalmaz ’a’ betűt.
a = str(input("Adj meg egy szót:"))
if "a" or "A" in a:
    print("A(z)",a,"szó tartalmaz a betűt.")
else:
    print("A(z)",a, "szó nem tartalmaz a betűt.")