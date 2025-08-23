import exe0.Lampada;

public class Main {
    public static void main(String[] args) {
        Lampada obj1 = new Lampada();
        obj1.setBrilho(50);
        obj1.exibe();
        Lampada obj2 = new Lampada();
        obj2.setBrilho(120);
        obj2.setLigada(true);
        obj2.setCor("Branca");
        obj2.setMarca("Philips");

        System.out.println("Cor " + obj2.getCor() +
                " Brilho: " + obj2.getBrilho()) ;
        obj2.exibe();
        Lampada obj3 =
   new Lampada("Elgin", "Branca", true, 240);
        obj3.exibe();

    }
}