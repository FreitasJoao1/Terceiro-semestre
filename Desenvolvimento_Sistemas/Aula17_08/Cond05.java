import java.util.Scanner;

public class Cond05 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome =sc.nextLine();

        System.out.println("Informe a senha: ");
        String senha=sc.nextLine();

        if (nome.equals("Raquel") && senha.equals("123")) {
            System.out.println("Conectado com sucesso!!!");

        } else if(nome.equals("Maria") && senha.equals("345")) {
            System.out.println("Conectado com sucesso!!!");
            
        } else{
            System.out.println("Login ou senha inválida");
        }
        sc.close();
    }
}
