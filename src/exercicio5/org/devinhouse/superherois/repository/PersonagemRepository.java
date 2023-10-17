package exercicio5.org.devinhouse.superherois.repository;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {
    private static List cadastroDePersonagens = new ArrayList();

    public static void cadastrarPersonagens(Object o){
        cadastroDePersonagens.add(o.toString());
    }


    public static List getCadastroDePersonagens(){
        return cadastroDePersonagens;
    }
}
