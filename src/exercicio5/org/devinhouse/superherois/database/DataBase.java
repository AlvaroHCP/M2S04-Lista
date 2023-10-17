package exercicio5.org.devinhouse.superherois.database;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static List cadastroDePersonagens = new ArrayList();

    public static void cadastrarPersonagens(Object o){
        cadastroDePersonagens.add(o.toString());
    }


    public static List getCadastroDePersonagens(){
        return cadastroDePersonagens;
    }
}
