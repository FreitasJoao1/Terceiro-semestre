import java.util.Scanner;

public class Dw04 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String senha="";
        
        do{
            System.out.println("Digite a senha: ");
            senha = sc.nextLine();
            
        } while (!senha.equals("1236"));

        System.out.println("Acesso permitido");
        sc.close();
    }
}