public class ContaCorrente extends Conta implements Tributavel {

        private double valorImposto;

        @Override
        public double getValorImposto() {
                return valorImposto;
        }

        public ContaCorrente(int agencia, int numero) {
                super(agencia, numero);
        }

        @Override
        public void deposita(double valor) {
                super.saldo += valor;
        }

        @Override
        public boolean saca(double valor) {
                double valorASacar = valor + 0.2;
                return super.saca(valorASacar);
        }
}
