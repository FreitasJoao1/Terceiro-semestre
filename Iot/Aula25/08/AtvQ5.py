import os
os.system("cls")


senha = input("Digite uma senha de 4 dígitos numéricos: ")

while len(senha) != 4 or not senha.isdigit():
    print("senha inválida")
    senha = input("Digite uma senha de 4 dígitos numéricos: ")

print("Senha cadastrada com sucessa")
