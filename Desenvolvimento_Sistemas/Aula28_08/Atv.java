import java.util.Scanner;

public class Atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];
        int[] quantidades = new int[5];
        int qtd = 0;

        while (true) {
            System.out.println("=== Sistema de Controle de Produtos ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    if (qtd < produtos.length) {
                        System.out.print("Digite o nome do produto: ");
                        produtos[qtd] = sc.nextLine();
                        System.out.print("Digite a quantidade em estoque: ");
                        quantidades[qtd] = sc.nextInt();
                        sc.nextLine(); // Limpar buffer
                        qtd++;
                    } else {
                        System.out.println("Capacidade máxima atingida. Não é possível cadastrar mais produtos.");
                    }
                    break;
                case 2:
                    System.out.println("=== Lista de Produtos ===");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println("Índice: " + i + " | Produto: " + produtos[i] + " | Quantidade: " + quantidades[i]);
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do produto para pesquisar: ");
                    String nomePesquisa = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("Produto encontrado! Índice: " + i + " | Produto: " + produtos[i] + " | Quantidade: " + quantidades[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do produto para alterar: ");
                    String nomeAlterar = sc.nextLine();
                    boolean alterado = false;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Digite o novo nome do produto: ");
                            produtos[i] = sc.nextLine();
                            System.out.print("Digite a nova quantidade em estoque: ");
                            quantidades[i] = sc.nextInt();
                            sc.nextLine(); // Limpar buffer
                            alterado = true;
                            System.out.println("Produto alterado com sucesso!");
                            break;
                        }
                    }
                    if (!alterado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();
                    boolean removido = false;
                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i].equalsIgnoreCase(nomeRemover)) {
                            for (int j = i; j < qtd - 1; j++) {
                                produtos[j] = produtos[j + 1];
                                quantidades[j] = quantidades[j + 1];
    }
}
    }
            }

        }
    }
}
