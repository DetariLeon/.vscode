file = open('ub2017egyeni.txt','r', encoding='utf_8')
file.readline()
lista = []
for i in file:
    lista.append(i.strip().split(";"))
print(lista)

ha = False
for a in range(len(lista)):
    if "Zsolt" in lista[a][0]:
        ha = True
if ha == True:
    print("Van Zsolt nevű indulo.")
else:
    print("Nem indult")
    
noi = 0
for b in range(len(lista)):
    if lista[b][2] == "Noi":
        noi += 1
print(noi, "nő van")

osszes = 0
for c in range(len(lista)):
    osszes += int(lista[c][4])
print(osszes / len(lista), "az átlag.")
#25 óranal kevesebb
ora = 0
for d in range(len(lista)):
    if int(lista[d][3].split(":")[0]) < 25:
        ora += 1
print(ora)
