package exe1;
public class Cofrinho {
    private double saldo;
    private boolean fechado;
    public Cofrinho() {
        this.setSaldo(0);
        this.setFechado(false);
    }
    public Cofrinho(double saldo, boolean fechado) {
        this.setSaldo(saldo);
        this.setFechado(fechado);
    }
    public void setSaldo(double saldo) {
        if (!this.fechado && saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Cofrinho fechado ou saldo negativo");
    }
    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
    public void abrir(){
        if (this.fechado){
            this.setFechado(false);
        }
    }
    public void fechar(){
        if (!this.fechado){
            this.setFechado(true);
        }
    }
    public void depositar(double valor){
        if (valor > 0 && !this.fechado){
            this.setSaldo(this.saldo + valor);
        }
    }
    public void retirarTudo(){
        if (!this.fechado){
            System.out.println("Valor retirado " + this.saldo);
            this.saldo = 0;
        }
    }
}
