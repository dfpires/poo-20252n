import exe2.ContaBancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 =
                new ContaBancaria("João", "12345678", 1000, true);
        ContaBancaria conta2 =
                new ContaBancaria("José", "987654321", 2000, true);

        conta1.transferir(conta2, 500);

        conta1.exibe();
        conta2.exibe();

    }
}
