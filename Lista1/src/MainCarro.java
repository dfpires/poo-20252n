import exe0.Carro;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {

       // criar um objeto da classe Carro
       Carro obj1 = new Carro();
       obj1.marca = "Fiat";
       obj1.modelo = "Argo";
       obj1.ano = 2023;
       obj1.motor = true;
       obj1.velocidade = 30;

       obj1.exibe();

       // Cria um outro objeto da classe Carro (instância)
       Carro obj2 = new Carro();
       // cria um objeto para entrada de dados
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite a marca do carro: ");
       obj2.marca = entrada.nextLine();
       System.out.println("Digite o modelo do carro: ");
       obj2.modelo = entrada.nextLine();
       System.out.println("Digite o ano do carro: ");
       obj2.ano = entrada.nextInt();
       System.out.println("Digite o motor do carro: ");
       obj2.motor = entrada.nextBoolean();
       System.out.println("Digite a velocidade do carro: ");
       obj2.velocidade = entrada.nextFloat();

       obj2.exibe();
    }
}