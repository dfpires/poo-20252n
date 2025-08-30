import exe0.Carro;

public class MainAutomotivo {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        car1.setModelo("Onix");
        car1.setMotor(100, true);
        System.out.println(car1.toString());

        Carro car2 = new Carro("Polo", 120, true);
        System.out.println(car2.toString());

    }
}
