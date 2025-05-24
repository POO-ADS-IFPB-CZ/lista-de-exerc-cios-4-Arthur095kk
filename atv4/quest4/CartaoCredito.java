package quest4;

class CartaoCredito extends Pagamento {
    @Override
    public void processar(double valor) {
        double valorFinal = valor * 1.05;
        System.out.println("Pagamento com Cartão de Crédito. Taxa de 5%.");
        System.out.println("Valor final: R$ " + valorFinal);
    }
}