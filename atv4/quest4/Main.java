package quest4;
import java.util.Scanner;

abstract class Pagamento {
    public abstract void processar(double valor);
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pagamento CartaoCredito = new CartaoCredito();
        CartaoCredito.processar(100.0);

        System.out.println();

        Pagamento Boleto = new Boleto();
        Boleto.processar(100.0);

        System.out.println();

        Pagamento Pix = new Pix();
        Pix.processar(100.0);

        scanner.close();
    }
}
