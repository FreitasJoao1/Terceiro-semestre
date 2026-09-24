public interface Pagamento {

    // Dinheiro
    void realizarPagamento(double valor);

    //Pix
    void realizarPagamento(double valor, String chavePix);

    // Cartão

    void realizarPagamento(double valor, int parcelas);

}
