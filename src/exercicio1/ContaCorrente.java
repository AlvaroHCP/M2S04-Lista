package exercicio1;

public class ContaCorrente extends Conta implements Operavel {
    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        super.saldo -= valor;
        return super.obterSaldoAtual();
    }
}