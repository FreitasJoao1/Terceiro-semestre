public class ContaCorrente extends Conta implements Pagamento{
    public ContaCorrente(int numero, String titular, double saldo, Agencia Agencia){
        super(numero, titular, null, Agencia);
    }

    //Pagamento em dinheiro
    @Override
    public void realizarPagamento(double valor){
        if (valor<=0) {
            System.out.println("O valor do pagamento deve ser maior que 0");
            return;
        }
        if (getSaldo() - valor);
        System.out.printf("");
    }
}
