import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();

        if (idade>=18) {
            System.out.println("Maior idade");
        } else {
            System.out.println("menor idade");
        }
        sc.close();
    }
}