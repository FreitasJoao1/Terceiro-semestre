import java.util.Scanner;

public class Dw05 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int op;
        do{
            System.out.println("1- Iniciar o jogo: ");
            System.out.println("2- Carregar o jogo");
            System.out.println("3- Configuração");
            System.out.println("0- Sair");

            op = sc.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println("Iniciar o jogo");
                break;
            case 2:
                System.out.println("Carregar o jogo");
                break;
            case 3:
                System.out.println("Configuração");
                break;
            case 0:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        } while (op != 0);
    sc.close();
    }
}