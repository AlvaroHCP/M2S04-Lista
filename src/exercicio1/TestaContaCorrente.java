package exercicio1;

public class TestaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        System.out.println(contaCorrente.obterSaldoAtual());
        contaCorrente.depositar(500);
        System.out.println(contaCorrente.obterSaldoAtual());
        contaCorrente.sacar(300);
        System.out.println(contaCorrente.obterSaldoAtual());
    }
}