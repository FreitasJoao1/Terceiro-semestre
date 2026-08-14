
import java.util.Scanner;


public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.printf("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        sc.close();
    
        double media = (nota1 + nota2) / 2;
        System.out.printf("Aluno: %s | Média: %.2f", nome, media);
    }
}
