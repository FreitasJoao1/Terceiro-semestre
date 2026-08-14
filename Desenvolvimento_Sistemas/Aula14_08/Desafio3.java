import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome_cliente=sc.nextLine();

        System.out.println("Digite o nome do produto: ");
        String nome_produto=sc.nextLine();


        System.out.println("Digite a Quantidade: ");
        Double quantidade_produto=sc.nextDouble();

        System.out.println("Digite o valor unitário: ");
        Double valor_unitario=sc.nextDouble();

        Double valor_total=quantidade_produto*valor_unitario;

        System.out.printf("---- Nota Fiscal ---");
        System.out.printf("Cliente: %s%n", nome_cliente);
        System.out.printf("Produto: %s%n", nome_produto);
        System.out.printf("Quantidade: %0.2f%n", quantidade_produto);
        System.out.printf("Valor unitário: %.2f%n", valor_unitario);
        System.out.printf("Valor total: %.2f%n", valor_total);
        System.out.printf("--------------------");
        



    }
}
gh