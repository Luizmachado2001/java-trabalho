public class ContaBanco {
    private double saldo;

    public ContaBanco() {
        this.saldo = 0;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: R$" + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
}