import java.util.Scanner;
public class Vet07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String [3];

        // Cadastrar
        System.out.println("=== Cadastrar de Nomes ===");
        for(int i=0; i<nomes.length;i++){
            System.out.println("Digite o nome: ");
            nomes[i]=sc.nextLine();

        }
        
        
        
        // Listar
        System.out.println("\n Lista atual");
        listar(nomes);

        //alterar

        System.out.println("\nDigite a posição para alterar: ");
        int posAlterar=sc.nextInt();
        sc.nextLine();

        if (posAlterar>=0 && posAlterar<nomes.length) {
            System.out.println("Digite o novo nome: ");
            nomes[posAlterar]=sc.nextLine();
        }else{
            System.out.println("posição inválida");
        }

        System.out.println("Lista atualizada: ");
        listar(nomes);
        



        sc.close();
    }


    
    }
