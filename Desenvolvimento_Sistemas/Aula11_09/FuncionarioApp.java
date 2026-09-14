package Funcionarios;
import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FuncPROF prof = null;
        FuncTEC tec = null;
        int op;

        do {
            System.out.println("===== SISTEMA DE FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Técnico");
            System.out.println("3 - Exibir Professor");
            System.out.println("4 - Exibir Técnico");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite um número de 0 a 4.");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1: {
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a disciplina: ");
                    String disciplina = sc.nextLine();

                    prof = new FuncPROF(nome, salario, disciplina);
                    System.out.println("\nProfessor cadastrado com sucesso!\n");
                    break;
                }
                case 2: {
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe o setor: ");
                    String setor = sc.nextLine();

                    tec = new FuncTEC(nome, salario, setor);
                    System.out.println("\nTécnico cadastrado com sucesso!\n");
                    break;
                }
                case 3: {
                    if (prof != null) {
                        System.out.println("\n-- Dados do Professor --");
                        prof.exibirDados();
                        System.out.println();
                    } else {
                        System.out.println("\nNenhum professor cadastrado ainda!\n");
                    }
                    break;
                }
                case 4: {
                    if (tec != null) {
                        System.out.println("\n-- Dados do Técnico --");
                        tec.exibirDados();
                        System.out.println();
                    } else {
                        System.out.println("\nNenhum técnico cadastrado ainda!\n");
                    }
                    break;
                }
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Entrada inválida!");
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}