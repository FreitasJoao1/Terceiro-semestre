import java.util.Scanner;

public class atv3diversao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        do {
        System.out.println("Digite o nome do professor mais fofo do Senai: ");
        nome = sc.nextLine();
        if (!nome.equalsIgnoreCase("Anderson")) {
            System.out.println("Você digitou: " + nome + ". Tente novamente.");
        }
        } while (!nome.equalsIgnoreCase("Anderson"));
        System.out.println("Parabéns! Você acertou, Anderson é o professor mais fofo do Senai!");
        sc.close();
    }
}
