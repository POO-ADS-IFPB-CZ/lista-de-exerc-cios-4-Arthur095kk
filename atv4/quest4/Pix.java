package quest4;

class Pix extends Pagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Pagamento com Pix. Sem taxas.");
        System.out.println("Valor final: R$ " + valor);
    }
}

