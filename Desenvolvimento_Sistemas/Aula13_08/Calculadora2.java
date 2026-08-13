import java.util.Scanner;

public class Calculadora2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o N1: ");
        double N1 = sc.nextDouble();

        System.out.println("Informe o N2: ");
        double N2 = sc.nextDouble();
        

        double soma=N1+N2;
        double sub=N1-N2;
        double mult=N1*N2;
        double div=N1/N2;
        double media=(N1+N2)/2;

        sc.close();
        System.out.println("Operações com os números. A média: "+media+" A soma: "+soma+" A subtração: "+sub+" A multiplicação: "+mult+" A divisão: "+div);
    }

}