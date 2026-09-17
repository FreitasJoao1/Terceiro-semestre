package Aula17_09.atividade1;
public class Pix implements  Pagamento{
    public void pagar(double valor){
        System.out.println("Pagamento realizado!");
        System.out.println("Valor pago: R$ "+valor);
    }
}
