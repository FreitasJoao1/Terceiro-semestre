import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a cor do CD que deseja (verde, azul, amarelo e vermelho): ");
        String cor=sc.nextLine();


        if (cor.equals("azul")) {
            System.out.println("O preço do CD Azul é R$20,00");
        } else if (cor.equals("verde")) {
            System.out.println("O preço do CD verde é R$10,00");
        } else if (cor.equals("amarelo")) {
            System.out.println("O preço do CD Amarelo é R$30,00");
        } else if (cor.equals("vermelho")) {
            System.out.println("O preço do CD vermelho é R$40,00");
        }

        }
}
