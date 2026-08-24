import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for(int i=1;i<=3;i++){
            System.out.println("Informe o "+i+"º número: ");
            int numero = scanner.nextInt();
            System.out.println("O número informado foi: " + numero);
                }
    scanner.close();
            }
}
