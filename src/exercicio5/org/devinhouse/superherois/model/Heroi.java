package exercicio5.org.devinhouse.superherois.model;

public class Heroi extends Personagem {
    private String nomeVidaReal;
    public Heroi (String nome, String superPoder, String nomeVidaReal){
        super.nome = nome;
        super.superPoder = superPoder;
        this.nomeVidaReal = nomeVidaReal;
    }

    @Override
    public String toString() {
        return "Heroi{\n" +
                "Nome = '" + nome + '\'' +
                ", SuperPoder = '" + superPoder + "'" +
                ", Nome na Vida Real = '" + nomeVidaReal + "'\n" +
                "}\n";
    }
}
