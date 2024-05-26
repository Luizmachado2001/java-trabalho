public class AplicarBanco {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();

        double investimentoCDB = calcularRendimentoMensal(200, 6, 0.10);
        double investimentoLCI = calcularRendimentoMensal(200, 6, 0.08);

        System.out.println("Rendimento mensal do CDB: R$" + investimentoCDB);
        System.out.println("Rendimento mensal do LCI: R$" + investimentoLCI);
    }

    public static double calcularRendimentoMensal(double investimentoMensal, int meses, double taxaAnual) {
        double taxaMensal = taxaAnual / 12;
        double saldo = 0;

        for (int i = 0; i < meses; i++) {
            saldo += investimentoMensal;
            saldo *= (1 + taxaMensal);
        }

        return saldo - (investimentoMensal * meses);
    }
}