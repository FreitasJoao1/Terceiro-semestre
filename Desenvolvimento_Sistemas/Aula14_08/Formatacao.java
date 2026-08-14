public class Formatacao {
    public static void main(String[] args) {
        String produto="Teclado";
        double quantidade=2;
        double preco= 150.00;

        System.out.printf("Produto: %s%n", produto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}