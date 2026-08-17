import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1º numero: ");
        double n1 =sc.nextDouble();
        
        System.out.println("Digite o 2º numero: ");
        double n2 =sc.nextDouble();
        
        System.out.println("Digite a operção que deseja: ");
        String op =sc.nextLine();
        Double res = sc.nextDouble();
        
        if(op.equals("+")) {
            res = (n1 + n2);
            System.out.println("");
        }
    }

}
