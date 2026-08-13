
import java.util.Scanner;


public class Imc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("O IMC é: "+imc);
    }
}
