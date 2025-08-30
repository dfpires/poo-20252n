package exe0;

public class Motor {
    private int potencia;
    private boolean ligado;

    public Motor() {
    }
    public Motor(int potencia, boolean ligado) {
        this.potencia = potencia;
        this.ligado = ligado;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", ligado=" + ligado +
                '}';
    }
}
