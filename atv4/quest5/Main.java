package quest5;

abstract class Personagem {
    public abstract void atacar();
}

public class Main {
   public static void main(String[] args) {
        Personagem guerreiro = new Guerreiro();
        guerreiro.atacar();

        System.out.println();

        Personagem mago = new Mago();
        mago.atacar();

        System.out.println();

        Personagem arqueiro = new Arqueiro();
        arqueiro.atacar();
    }
}
