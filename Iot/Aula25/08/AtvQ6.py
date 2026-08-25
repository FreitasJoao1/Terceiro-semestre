import os 
os.system("cls")
notas = []
for i in range(8):
    nota_aluno = float(input(f"Digite a {i+1}ª nota: "))
    notas.append(nota_aluno)

media = sum(notas)/len(notas)
notas_acima = []
for nota in notas:
    if nota > media:
        notas_acima.append(nota)

print("As notas acima da média são: ", notas_acima)
print(f"A média das notas é: {media:.1f}")

