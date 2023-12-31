package exercicio5.org.devinhouse.superherois.model;

public class Vilao extends Personagem{
    private Integer tempoDePrisao;
    public Vilao (String nome, String superPoder, int tempoDePrisao){
        super.nome = nome;
        super.superPoder = superPoder;
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return "Vilão{\n" +
                "Nome = '" + nome + '\'' +
                ", SuperPoder = '" + superPoder + "'" +
                ", Tempo de Prisão = '" + tempoDePrisao + "'\n" +
                "}\n";
    }
}
