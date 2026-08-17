import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o 2º numero: ");
        double n2 = sc.nextDouble();
        System.out.println("Digite a operação que deseja: ");
        sc.nextLine();
        String op = sc.nextLine();
        Double res = 0.0;
        if(op.equals("+")) {
            res = (n1 + n2);
        }
        if(op.equals("-")) {
            res = (n1 - n2);
        }
        if(op.equals("*")) {
            res = (n1 * n2);
        }
        if(op.equals("/")) {
            res = (n1 / n2);
        }
        System.out.println("Resultado: " + res);
        sc.close();
    }
}