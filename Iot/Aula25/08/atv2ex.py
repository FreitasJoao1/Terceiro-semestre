import os 
os.system("cls")

numeros = []
while True:

    num = int(input("Diga o número: "))
    if(num!=0):
        num.append(numeros)

    else:
        break

soma = sum(numeros)
print(F"a soma dos numeros: {soma}")