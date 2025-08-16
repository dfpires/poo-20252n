package exe0;
public class Carro {
    // variáveis
    public int ano;
    public float velocidade;
    public boolean motor;
    public String marca, modelo;


    //métodos
    public void exibe(){
        // this representa o objeto que chama o método
        System.out.println("Modelo: " + this.modelo +
                " Velocidade " + this.velocidade);
    }
}
