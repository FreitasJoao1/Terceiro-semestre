import customtkinter as ctk

ctk.set_appearance_mode("dark")


def calcular():
    d = float(dstviagem.get())
    c = float(consumo.get())
    p = float(precogas.get())

    formula = (d / c) * p

    resultado.configure(text=f"O valor para a viagem é de R$ {formula:.2f}")


janela = ctk.CTk()
janela.geometry("400x500")
janela.resizable(False, False)
janela.title("APP VIAGEM")

titulo = ctk.CTkLabel(
    janela, text="APP VIAGEM", text_color="WHITE", font=("VERDANA", 30, "bold")
)
titulo.pack(pady=10)

dstviagem = ctk.CTkEntry(
    janela,
    width=320,
    height=40,
    border_color="white",
    placeholder_text="Digite a distância da viagem",
)
dstviagem.pack(pady=10)

consumo = ctk.CTkEntry(
    janela,
    width=320,
    height=40,
    border_color="white",
    placeholder_text="Digite o consumo do seu veículo",
)
consumo.pack(pady=10)

precogas = ctk.CTkEntry(
    janela,
    width=320,
    height=40,
    border_color="white",
    placeholder_text="Digite o preço atual do combustível",
)
precogas.pack(pady=10)

botao = ctk.CTkButton(
    janela,
    width=200,
    height=40,
    text="Calcular Gasto",
    fg_color="#97f577",
    text_color="#ffffff",
    font=("arial", 20),
    command=calcular,
)
botao.pack(pady=15)

resultado = ctk.CTkLabel(
    janela, text="", text_color="white", font=("arial", 16)
)
resultado.pack(pady=10)

janela.mainloop()