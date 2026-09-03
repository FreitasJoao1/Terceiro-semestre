import java.util.Scanner;
public class joaopedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        int maxAviao = 4;
        int maxReservas= 20;

        int [] numerosAviao = new int[maxAviao];
        int [] assentosDisp = new int[maxAviao];


        String[] passageiros = new String [maxReservas];
        int[] assentoReserva = new int [maxReservas];

        int quantidadeAviao;
        int totalReserva = 0;

        boolean avioesCadastrados = false;
        boolean assentosCadastrados = false;


        int op;

        System.out.println("Informe a quantidade de assentos disponíveis (máximo 20): ");
        quantidadeAviao = sc.nextInt();
        while (quantidadeAviao < 1 || quantidadeAviao> 4) {
            System.out.print("Quantidade inválida! Digite um valor entre 1 e 4: ");
            quantidadeAviao = sc.nextInt();
        }
        do {
            System.out.println("=========================================");
            System.out.println("    SWEET FLIGHT – SISTEMA DE RESERVAS");
            System.out.println("=========================================");
            System.out.println("1 - Cadastrar aviões");
            System.out.println("2 - Cadastrar quantidade de assentos");
            System.out.println("3 - Listar aviões");
            System.out.println("4 - Realizar reserva");
            System.out.println("5 - Consultar reservas de um avião");
            System.out.println("6 - Pesquisar passageiro");
            System.out.println("7 - Mostrar resumo");
            System.out.println("8 - Sair");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.println("\n--- Cadastro dos aviões ---");
                    for (int i = 0; i < quantidadeAviao; i++) {
                        System.out.print("Informe o número do avião " + (i + 1) + ": ");
                        numerosAviao[i] = sc.nextInt();
                    }
                    avioesCadastrados = true;
                    System.out.println("aviões cadastrados com sucesso!");
                    break;
                case 2:
                    if (!avioesCadastrados) {
                        System.out.println("Cadastre primeiro os números dos aviões!");
                    } else {
                        System.out.println("\n--- Cadastro de assentos por avião ---");
                        for (int i = 0; i < quantidadeAviao; i++) {
                            System.out.print("Informe a quantidade de assentos por avião " + numerosAviao[i] + ": ");
                            assentosDisp[i] = sc.nextInt();
                        }
                        assentosCadastrados = true;
                        System.out.println("Quantidade de assentos cadastrados com sucesso!");
                    }
                case 3:
                    System.out.println("Aqui está todos os avioões: "+numerosAviao+"");

                case 4:
                    if (!avioesCadastrados) {
                        System.out.println("Cadastre primeiro os aviões!");
                    } else if (!assentosCadastrados) {
                        System.out.println("Cadastre primeiro a quantidade de assentos!");
                    } else if (totalReserva >= maxReservas) {
                        System.out.println("Limite máximo de reservas atingido!");
                    } else {
                        int numeroAviao;
                        int posicaoAviao = -1;

                        System.out.print("Informe o número do avião para reserva: ");
                        numeroAviao = sc.nextInt();
                        sc.nextLine();

                        for (int i = 0; i < quantidadeAviao; i++) {
                            if (assentoReserva[i] == numeroAviao) {
                                posicaoAviao = i;
                                break;
                            }
                        }

                        if (posicaoAviao == -1) {
                            System.out.println("Este avião não existe!");
                        } else if (assentosDisp[posicaoAviao] <= 0) {
                            System.out.println("Não há assentos disponíveis neste avião!");
                        } else {
                            System.out.print("Informe o nome do passageiro: ");
                            passageiros[totalReserva] = sc.nextLine();
                            assentoReserva[totalReserva] = numeroAviao;

                            assentosDisp[posicaoAviao]--;
                            totalReserva++;

                            System.out.println("Reserva realizada com sucesso!");
                        }
                    }
                    break;
                case 5:
                    if (totalReserva == 0) {
                        System.out.println("Nenhuma reserva foi realizada ainda!");
                    } else {
                        int numeroAviaoConsulta;
                        int posicaoAviaoConsulta = -1;
                        boolean encontrouReserva = false;

                        System.out.print("Informe o número do avião para consulta: ");
                        numeroAviaoConsulta = sc.nextInt();

                        for (int i = 0; i < quantidadeAviao; i++) {
                            if (numerosAviao[i] == numeroAviaoConsulta) {
                                posicaoAviaoConsulta = i;
                                break;
                            }
                        }

                        if (posicaoAviaoConsulta == -1) {
                            System.out.println("Este avião não existe!");
                        } else {
                            System.out.println("Reservas do avião " + numeroAviaoConsulta + ":");
                            for (int i = 0; i < totalReserva; i++) {
                                if (numerosAviao[i] == numeroAviaoConsulta) {
                                    System.out.println("- " + passageiros[i]);
                                    encontrouReserva = true;
                                }
                            }

                            if (!encontrouReserva) {
                                System.out.println("Não há reservas para este avião!");
                            }
                        }
                    }
                    break;

                case 6:
                    if (totalReserva == 0) {
                        System.out.println("Nenhuma reserva foi realizada ainda!");
                    } else {
                        String nomeConsulta;
                        boolean encontrouPassageiro = false;

                        System.out.print("Informe o nome do passageiro: ");
                        nomeConsulta = sc.nextLine();

                        System.out.println("Reservas do passageiro " + nomeConsulta + ":");
                        for (int i = 0; i < totalReserva; i++) {
                            if (passageiros[i].equalsIgnoreCase(nomeConsulta)) {
                                System.out.println("- Assento: " + assentoReserva[i]);
                                encontrouPassageiro = true;
                            }
                        }

                        if (!encontrouPassageiro) {
                            System.out.println("Não há reservas para este Passageiro!");
                        }
                    }
                    break;


                case 7:
                    if (!avioesCadastrados) {
                        System.out.println("Nenhum avião foi cadastrado ainda!");
                    } else {
                        System.out.println("\n--- RELATÓRIO GERAL ---");
                        for (int i = 0; i < quantidadeAviao; i++) {
                            int contadorReservas = 0;

                            for (int j = 0; j < totalReserva; j++) {
                                if (numerosAviao[j] == numerosAviao[i]) {
                                    contadorReservas++;
                                    System.out.println("avião: " + numerosAviao[i]);
                                    System.out.println("A disponíveis: " + assentosDisp[i]);
                                    System.out.println("Quantidade de reservas: " + contadorReservas);
                                    
                                }
                                
                                System.out.println("---------------------------");
                        }
                    }}
                    break;
                case 8:
                    System.out.println("Sistema encerrado!");
                    break;
                
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        
        
    } while (op != 7);
    sc.close();
    
    
}
}