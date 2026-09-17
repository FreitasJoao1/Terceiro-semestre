package Aula17_09.atividade3;

public abstract class Animal {
    private String nome;
     
    private int idade;

    public Animal() {

    
    }
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public void SetNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }
    
    public String exibirInfo(){
        return "Cachorro | Nome: "+getNome()
        +"| Idade: "+getIdade();
    }
}

