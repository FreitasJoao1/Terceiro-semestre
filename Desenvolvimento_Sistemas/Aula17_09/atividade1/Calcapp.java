package Aula17_09.atividade1;
public class Calcapp {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(10, 5));
        System.out.println(calc.somar(3, 4, 5));
        System.out.println(calc.somar(10.5, 6.8));
    }
}
