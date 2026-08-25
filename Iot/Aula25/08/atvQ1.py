import os
os.system("cls")

negativos_qntd = 0
positivos_qntd = 0
positivos = []
negativos = []
numeros = []

for i in range(5):
    num = int(input(f"Digite o {i+1}º número: "))
    numeros.append(num)

    if num >= 1:
        positivos_qntd += 1
        positivos.append(num)
    else:
        negativos_qntd += 1
        negativos.append(num)

print(f"A quantidade de números positivos é: {positivos_qntd}")
print(f"A quantidade de números negativos é: {negativos_qntd}")
print(f"Os números positivos são: {positivos}")
print(f"Os números negativos são: {negativos}")
print(f"A soma dos números positivos é: {sum(positivos)}")
# corrigido