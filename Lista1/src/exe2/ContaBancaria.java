package exe2;
public class ContaBancaria {
    public String titular, numero;
    public double saldo;
    public boolean ativa;
    // ContaBancari obj = new ContaBancaria()
    public ContaBancaria(){
    }
    // ContaBancari obj = new ContaBancaria("José", "123", 0, true)
    public ContaBancaria(String titular, String numero, double saldo, boolean ativa) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
    }
    public void exibe(){
        System.out.println("Titular: " + titular +
                "\nNumero: " + numero.substring(0, numero.length() - 3) +
                "\nSaldo: " + saldo +
                "\nAtiva: " + ativa
        );
    }
    public void ativar(){
        if (!this.ativa){
            this.ativa = true;
        }
    }
    public void desativar(){
        if (this.ativa && this.saldo >= 0){
            this.ativa = false;
        }
    }
    public void depositar(double valor){
        if (valor > 0 && this.ativa) {
            this.saldo += valor;
        }
    }
    public boolean sacar(double valor){
        if (valor > 0 && this.ativa && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        else return false;
    }
    public void transferir(ContaBancaria destino, double valor){
        if (this.sacar(valor)){
            destino.depositar(valor);
        }
    }
}
