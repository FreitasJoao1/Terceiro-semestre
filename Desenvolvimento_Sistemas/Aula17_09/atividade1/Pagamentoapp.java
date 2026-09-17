package Aula17_09.atividade1;
import java.util.Scanner;

public class Pagamentoapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do pagamento: R$ ");
        double valor = sc.nextDouble();
        

        Pix pix=new Pix();
        pix.pagar(valor);

        sc.close();
    }
}
