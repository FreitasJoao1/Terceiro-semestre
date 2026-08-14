public class Desafio1 {
    public static void main(String[] args) {

        String Nome_do_produto="Teclado";
        int quantidade=20;
        double preco_un= 12.00;

        System.out.printf(
                "Nome do produto: %s | quantidade: %d | preço_unitário: R$ %.2f",
            Nome_do_produto,
            quantidade,
            preco_un
        );

    }
}