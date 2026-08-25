import os
os.system("cls")

temperatura = []

for i in range(5):
    temp = float(input(f"Digite a {i+1}ª temperatura: "))
    temperatura.append(temp)

media = sum(temperatura)/len(temperatura)
menor = min(temperatura)
maior = max(temperatura)

print(f"A maior temperatura do dia foi {maior} ºC")
print(f"A média temperatura do dia foi {media:.1f} ºC")
print(f"A menor temperatura do dia foi {menor} ºC")