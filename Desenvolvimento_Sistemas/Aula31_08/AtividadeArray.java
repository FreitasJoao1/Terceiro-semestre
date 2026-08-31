import java.util.Scanner;

public class AtividadeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int [5];



        while (true) {
            System.out.println("=== Menu do Programa ===");
            System.out.println("1- Cadastrar numero");
            System.out.println("2- Listar numeros");
            System.out.println("3- Remover numeros");
            System.out.println("0- Sair do programa");
            int opcao=sc.nextInt();
            sc.nextLine(); // Limpa o buffer

        
            switch (opcao){
                case 1:
                    for(int i=0; i<numeros.length;i++) {
                    System.out.println("Digite o numero: ");
                    numeros[i]=sc.nextInt();
                    }

                case 2:
                    // Listar
                    System.out.println("\n Lista atual");
                    listar(numeros);

                case 3:
                    // Remover
                    
                System.out.println("Digite a posição para remover: ");
                int posRemover=sc.nextInt();

                    if (posRemover >= 0 && posRemover < numeros.length) {
                    for (int i = posRemover; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }
                    numeros[numeros.length - 1] = 0;

                    System.out.println("\nLista Atualizada:");
                    listar(numeros);
                } else {
                    System.out.println("Erro: Posição inválida!");
                }

                break;
                case 0:
                System.out.println("Saindo do programa...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;

                }
                
            }


}
private static void listar(int[] numeros) {
    for (int i=0;i<numeros.length;i++){
        if (numeros[i]!=0) {
                System.out.println("Posição: "+i+" = "+numeros[i]);
            }
        }
    }
}
