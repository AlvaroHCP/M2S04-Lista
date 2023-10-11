package exercicio3;

public class Produto implements Tributavel {

    @Override
    public double calcularValorComImposto(double valor, double imposto) {
        return valor + imposto;
    }
}
