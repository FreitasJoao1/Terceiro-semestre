import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxReservas = 5;

        String[] hospedes = new String[maxReservas];
        int[] quartoReserva = new int[maxReservas];

        int quantidadeQuartos;
        int totalReservas = 0;

        boolean quartosCadastrados = false;
        boolean camasCadastradas = false;

        int opcao;

        System.out.println("Informe a quantidade de quartos disponíveis (máximo 5): ");
        quantidadeQuartos = sc.nextInt();
        while (quantidadeQuartos<1 || quantidadeQuartos>5) {
            System.out.println("Quantidade inválida! Digite um valor entre 1 e 5: ");
            quantidadeQuartos=sc.nextInt();
            
        } do {
    System.out.println("\n===MENU===");
    System.out.println("1-Registrar número dos quartos");
    System.out.println("2-Registrar quantidade de camas");
    System.out.println("3-Reservar quartos");
    System.out.println("4-Consulta reservas por quarto");
    System.out.println("5-Consulta reservas por hóspede");
    System.out.println("6-Mostrar relatório geral");
    System.out.println("7-Encerrar");
    System.out.println("Escolha a opção: ");
    opcao = sc.nextInt();
    sc.nextLine();

        switch (opcao) {
    case 1:
        System.out.println("\n---Cadastro dos Quartos---");
        for(int i=0; i<quantidadeQuartos; i++){
            System.out.println("Informe o número do quarto: "+(i+1)+" : ");
            numerosQuartos[i]=sc.nextInt();
        }

        quartosCadastrados=true;
        System.out.println("Quartos cadastrados com sucesso!");
        break;

    case 2:
        if (!quartosCadastrados) {
            System.out.println("Cadastre primeiro os números dos quartos!");
        }else{
            System.out.println("\n---Cadastro de camas por quarto---");
            for(int i=0; i<quantidadeQuartos; i++){
                System.out.println("informe a quantidade de camas do quarto "+numerosQuartos[i]+" : ");
                camasDisponiveis[i]=sc.nextInt();
            }
            camasCadastradas=true;
            System.out.println("Quantidade de camas cadastrada com sucesso!");
        }
                    
                    break;
            
                default:
                    break;
            }

    } while(opcao!=7);
        }
        
        
    }