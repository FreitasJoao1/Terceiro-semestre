import os
os.system("cls")

#  3) Escreva um programa que leia uma lista de 5 nomes e depois exiba esses
# nomes em ordem alfabética.

for i in range(5):
    nome = input(f"Digite o {i+1}º nome: ")
    nomes.append(nome)

ordem = sorted(nomes)
print(f"Os nomes em ordem alfabética são: {ordem}")