package exe2;
public class Cafeteira {
    private int agua, poCafe;
    private boolean ligada;
    public Cafeteira() {
        this.ligada = false; this.agua = 0; this.poCafe = 0;
    }
    public Cafeteira(int agua, int poCafe, boolean ligada) {
        this.setAgua(agua); this.setPoCafe(poCafe);
        this.setLigada(ligada);
    }
    public void setAgua(int agua) {
        if  (agua >= 0 && agua <= 2000) {
            this.agua = agua;
        }
        else {
            System.out.println("Valor da água inválido");
        }
    }
    public void setPoCafe(int poCafe) {
        if (poCafe >= 0 && poCafe <= 100) {
            this.poCafe = poCafe;
        }
        else {
            System.out.println("Valor do pó de café inválido");
        }
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public int getAgua() {
        return agua;
    }
    public int getPoCafe() {
        return poCafe;
    }
    public boolean isLigada() {
        return ligada;
    }

    public void ligar(){
        if (!this.ligada) this.setLigada(true);
        else System.out.println("Já ligada");
    }
    public void desligar(){
        if (this.ligada) {
            this.setLigada(false);
        }
        else System.out.println("Já desligada");
    }
    public void adicionaAgua(int ml){
        if (ml > 0) {
            this.setAgua(this.agua + ml);
        }
        else System.out.println("Qtde negativa");
    }
    public void adicionaCafe(int gramas){
        if (gramas > 0){
            this.setPoCafe(this.poCafe + gramas);
        }
        else System.out.println("Qtde negativa");
    }
    public void prepararCafe(){
        if (this.ligada && this.agua >= 100 && this.poCafe >= 10){
            this.setAgua(this.agua - 100);
            this.setPoCafe(this.poCafe - 10);
        }
        else System.out.println("Problema para o preparo");
    }
    public void exibe(){
        System.out.println("Água: " + this.agua +
            " Pó de café " + this.poCafe +
                " Ligada " + (this.ligada ? "Sim": "Não"));
    }

    public void quantosCafesPossiveis(){
        int dosesAgua = this.agua / 100;
        int dosesCafe = this.poCafe / 10;
        int menor;
        menor = Math.min(dosesCafe, dosesAgua);
        System.out.println("Qtde de cafés possíveis " + menor);
    }
}


