import java.util.Scanner;

public class Atv6 {
    
// 6-Escreva o programa que deverá apresentar o seguinte menu ao usuário: 1 - Calcular Tabuada 2 - Realizar Contagem Regressiva 0 - Sair
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("---- MENU ----");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite um número para calcular a tabuada: ");
                    int num = sc.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;

                case 2:
                    System.out.print("Digite um número para iniciar a contagem regressiva: ");
                    int inicio = sc.nextInt();

                    for (int i = inicio; i >= 0; i--) {
                        System.out.println(i);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (op != 0);

        sc.close();
    }
}

