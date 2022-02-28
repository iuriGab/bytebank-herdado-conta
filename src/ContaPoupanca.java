public class ContaPoupanca extends Conta implements Tributavel {

    private double valorImposto;

    @Override
    public double getValorImposto() {
        return valorImposto;
    }

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
