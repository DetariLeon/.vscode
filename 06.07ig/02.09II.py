a = "indul a gorog aludni"
nagy = a.capitalize() #Az elso nagy
print(nagy)
#swapcase kicsibol nagy es forditva
b = "Madar Kavics Terkep"
print(b.swapcase())
#title = minden szo elso beuteje nagy
print(b.title())
#startwith T/F
print("b-vel kezdodik? ",b.startswith("m"))
#endwith mivel vegzodik? T/F
print("b-vel vegzodik? ", b.endswith("b"))
#find hányadik betutol kezdodik a megadott kifejezés.
print(b.find("Kavics"))
print(b.find("a")) #ha -1, akkor nincs benne
#rfind; mindenbol az utolso megfordulast keressuk.
print(b.rfind("a"))
#rindex; ezt nem jo... csak a find; ha nincs benne, error, és kidob
print(b.rindex("K"))
#isalnum; csak betu/szam;
print(b.isalnum()) #A szokoz is az
#isalpha; csak betu;
print(b.isalpha())
#isnumeric; minden karekter szam?;
szam = "432"
print(szam.isnumeric())
#isspace; akkor ad igazat, ha mindenkarakter ures;
print(b.isspace())
space = "    "
print(space.isspace())
print("hello\nszia")
#\n -> enter;\t -> tab
#isenter; iagazat ad, ha a stringben csak whitespace karakterek vannak.
#islower; igazat ad, ha minden karakter kicsi; T/F; 
print(a.islower())
#isupper akkor ha minden nagy; istitle, akkor ha minden kezdobetu nagy.
#join
lista = ["Anett", "Gábor", "Léna"]
print(" ".join(lista)) #vagy
print(*lista)
#strip; levágja a szokozoket az elejérol es a vegerol
asd = "         Helo          három           "
print(asd.strip())
#l/s-strip 
print(asd.lstrip()) #bal; csak bal oldalról vágja le a szokozoket
print(asd.rstrip()) #jobb; csak jobb oldalrol vagja le a szokozoket
#split(): a szöveget feldarabolja a megadott karakter mentén és a darabokat tömbbé teszi
szoveg = " kecske-ló-kutya-béka"
lista = szoveg.split("-")
print(lista)
##split(): a szöveget feldarabolja a megadott karakter mentén és a darabokat tömbbé teszi(max parameter nelkul ua mint split())
bokor = " kecske-ló-kutya-béka"
lista = bokor.rsplit("-")
print(lista)
#splitlines(): a szöveget feldarabolja aortörés mentén, és a darbaokat tümbbe teszi
szoveg ="kecske\nló\nkutya\nbéka"
print (szoveg)
lista= szoveg.splitlines()
print(lista)