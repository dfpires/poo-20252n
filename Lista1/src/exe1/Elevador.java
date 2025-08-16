package exe1;
public class Elevador {
    // variáveis de instância
    public int andarAtual, totalAndares, capacidade, lotacao;

    // método construtor
    public Elevador(int ta, int ce){
        this.totalAndares = ta;
        this.capacidade = ce;
        this.andarAtual = 0;
        this.lotacao = 0;
    }
    public Elevador(){
        this.andarAtual = 0;
        this.lotacao = 0;
    }
    // métodos de instância
    public void exibe(){
        System.out.println("Andar atual: " + this.andarAtual +
                "Qtde pessoas " + this.lotacao + "Capacidade " + this.capacidade);
    }
    public void subir(){
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
        }
        else System.out.println("Já chegou ao topo");
    }
    public void descer(){
        if (this.andarAtual > 0 ){
            this.andarAtual--;
        }
        else System.out.println("Já está no térreo");
    }
    public void entrar(float x) {
        // vai entrar todo mundo
        if (this.lotacao + x <= this.capacidade) {
            this.lotacao += x;
        } else { // vai ficar gente de fora
            this.lotacao = this.capacidade;
        }
    }
    public void sair(){
        if (this.lotacao > 0) {
            this.lotacao--;
        }
        else System.out.println("Não tem ninguém no Elevador");
    }
}
