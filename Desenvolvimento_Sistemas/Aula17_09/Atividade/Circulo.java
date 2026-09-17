package Aula17_09.Atividade;

public class Circulo extends Formageometria {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return mathPI*raio*raio;
    }
}
