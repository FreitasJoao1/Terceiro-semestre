import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a senha: ");
        String senha = sc.nextLine();

        if (senha.equals("jacarezinho123")){
            System.out.println("PORTA ABERTA");}
        else {
            System.out.println("SENHA NÃO CONFERE");
        }
        sc.close();
    }
}