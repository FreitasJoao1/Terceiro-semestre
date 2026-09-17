package Aula17_09.atividade1;
public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;

    }

    public void mostrarDados(){
        System.out.println("Mostrar dados :" + nome);
    }
}
