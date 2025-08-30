package exe0;
public class Carro {
    private String modelo;
    private Motor motor;
    public Carro() {
    }
    public Carro(String modelo, int potencia, boolean ligado) {
        this.modelo = modelo;
        this.motor = new Motor(potencia, ligado);
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(int potencia, boolean ligado) {
        this.motor = new Motor(potencia, ligado);
    }

    public void ligar(){
        this.motor.ligar();
    }

    public void desligar(){
        this.motor.desligar();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}
