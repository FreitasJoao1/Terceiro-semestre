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
        
        // Remover

        System.out.println("Digite a posição para remover: ");
        int posRemover=sc.nextInt();
        
        if (posRemover>=0 && posRemover<nomes.length){
            for(int i=posRemover; i<nomes.length-1;i++){
                nomes[i]=nomes[i+1];

            }
            nomes[nomes.length-1]=null;

        }else {
            System.out.print("Posição inválida");
        }
        System.out.println("\n Lista atualizada: ");
        listar(nomes);


        sc.close();
    }

    private static void listar(String[] nomes) {
        // TODO Auto-generated method stub
        for (int i=0;i<nomes.length;i++){
            if (nomes[i]!=null){
                System.out.println("Posição "+i+" = "+nomes[i]);
        }
    }
    }


    
    }
