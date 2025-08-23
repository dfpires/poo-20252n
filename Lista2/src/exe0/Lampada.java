package exe0;
public class Lampada {
    private boolean ligada;
    private int brilho;
    private String cor, marca;

    public Lampada(){

    }
    public Lampada(String marca, String cor, boolean ligada, int brilho){
        this.setMarca(marca);
        this.setCor(cor);
        this.setLigada(ligada);
        this.setBrilho(brilho);
    }
    //setters
    public void setBrilho(int brilho){
        if (brilho >= 0 && brilho <= 100){
            this.brilho = brilho;
        }
        else System.out.println("Brilho invalido");
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public void setCor(String cor){
        this.cor = cor;
        this.verificaCor();
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getBrilho(){
        return this.brilho;
    }
    public boolean getLigada(){
        return this.ligada;
    }
    public String getCor(){
        return this.cor;
    }
    public String getMarca(){
        return this.marca;
    }
    public void exibe(){
        System.out.println("Marca: " + this.marca +
                "\nCor: " + this.cor +
                "\nBrilho: " + this.brilho +
                "\nLigada: " + this.ligada);
    }
    public void ligar(){
        if (!this.ligada){
            this.setLigada(true);
        }
    }
    public void desligar(){
        if (this.ligada){
            this.setLigada(false);
            this.setBrilho(0);
        }
    }
    public void alterarBrilho(int brilho){
        if (this.ligada){
            this.setBrilho(brilho);
        }
    }
    public void mudarCor(String cor){
        if (this.ligada){
            this.setCor(cor);
        }
    }
    private void verificaCor(){
        if (this.cor.equals("branca" ) || this.cor.equals("amarela")){
            System.out.println("Cor usual");
        }
        else System.out.println("Cor bem diferente");
    }
}