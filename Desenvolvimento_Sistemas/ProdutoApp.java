import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto(null, 0.0f, 0);

        System.out.println("Informe o nome: ");
        p.setNome(sc.nextLine());

        System.out.println("Informe o preço: ");
        p.setPreco(sc.nextFloat());

        System.out.println("Informe a quantidade: ");
        p.setQuantidade(sc.nextInt());

        System.out.println("O nome: " + p.getNome());
        System.out.println("O preço: " + p.getPreco());
        System.out.println("A quantidade: " + p.getQuantidade());

        sc.close();
    }
}