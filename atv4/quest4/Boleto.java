package quest4;

class Boleto extends Pagamento {
    @Override
    public void processar(double valor) {
        double valorFinal = valor * 0.90;
        System.out.println("Pagamento com Boleto. Desconto de 10%.");
        System.out.println("Valor final: R$ " + valorFinal);
    }
}