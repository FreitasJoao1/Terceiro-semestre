import java.util.Scanner;

public class atv2diversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um número positivo (ou negativo para sair): ");
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println("Você digitou: " + numero);
            }
        } while (numero >= 0);
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
