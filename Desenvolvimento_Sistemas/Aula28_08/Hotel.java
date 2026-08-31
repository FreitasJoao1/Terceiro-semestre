
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdQuartos;
        do {
            System.out.print("Informe a quantidade de quartos disponíveis (máximo 5): ");
            qtdQuartos = sc.nextInt();
        } while (qtdQuartos <= 0 || qtdQuartos > 5);

        int[] numeroQuartos = new int[qtdQuartos];
        int[] qtdCamas = new int[qtdQuartos];

        final int limiteReservas = 25;
        String[] reservasHospedes = new String[limiteReservas];
        int[] reservasQuartos = new int[limiteReservas];
        int totalReservas = 0;

        int op;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Registrar número dos quartos");
            System.out.println("2 - Registrar quantidade de camas");
            System.out.println("3 - Reservar quarto");
            System.out.println("4 - Consultar reservas por quarto");
            System.out.println("5 - Consultar reservas por hóspede");
            System.out.println("6 - Encerrar sistema");
            System.out.print("Escolha a opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    for (int i = 0; i < qtdQuartos; i++) {
                        System.out.print("Informe o número do quarto " + (i + 1) + ": ");
                        numeroQuartos[i] = sc.nextInt();
                    }
                    sc.nextLine();
                    break;

                case 2:
                    for (int i = 0; i < qtdQuartos; i++) {
                        System.out.print("Quarto " + numeroQuartos[i] + " -> quantidade de camas: ");
                        qtdCamas[i] = sc.nextInt();
                    }
                    sc.nextLine();
                    break;

                case 3:
                    if (totalReservas >= limiteReservas) {
                        System.out.println("Limite máximo de 25 reservas atingido!");
                        break;
                    }

                    System.out.print("Número do quarto: ");
                    int numQuarto = sc.nextInt();
                    sc.nextLine();

                    int posQuarto = -1;
                    for (int i = 0; i < qtdQuartos; i++) {
                        if (numeroQuartos[i] == numQuarto) {
                            posQuarto = i;
                            break;
                        }
                    }

                    if (posQuarto == -1) {
                        System.out.println("Este quarto não existe!");
                    } else if (qtdCamas[posQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!");
                    } else {
                        System.out.print("Nome do hóspede: ");
                        String nome = sc.nextLine();

                        reservasHospedes[totalReservas] = nome;
                        reservasQuartos[totalReservas] = numQuarto;
                        totalReservas++;
                        qtdCamas[posQuarto]--;

                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;

                case 4:
                    System.out.print("Número do quarto: ");
                    int numBusca = sc.nextInt();
                    sc.nextLine();

                    int posBusca = -1;
                    for (int i = 0; i < qtdQuartos; i++) {
                        if (numeroQuartos[i] == numBusca) {
                            posBusca = i;
                            break;
                        }
                    }

                    if (posBusca == -1) {
                        System.out.println("Este quarto não existe!");
                    } else {
                        boolean temReserva = false;
                        for (int i = 0; i < totalReservas; i++) {
                            if (reservasQuartos[i] == numBusca) {
                                System.out.println("- " + reservasHospedes[i]);
                                temReserva = true;
                            }
                        }
                        if (!temReserva) {
                            System.out.println("Não há reservas para este quarto!");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Nome do hóspede: ");
                    String nomeBusca = sc.nextLine();

                    boolean temHospede = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (reservasHospedes[i].equalsIgnoreCase(nomeBusca)) {
                            System.out.println("- Quarto: " + reservasQuartos[i]);
                            temHospede = true;
                        }
                    }

                    if (!temHospede) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 6);

        sc.close();
    }
}

```public class Hotel {

}
