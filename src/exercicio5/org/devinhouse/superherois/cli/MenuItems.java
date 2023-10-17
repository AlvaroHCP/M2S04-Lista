package exercicio5.org.devinhouse.superherois.cli;

import java.util.Arrays;

public enum MenuItems {
    CADASTRAR_HEROI(1),
    CADASTRAR_VILAO(2),
    LISTAR(3),
    SAIR(4);

    public int codigo;

    private MenuItems(int codigo){
        this.codigo = codigo;
    }

    public static MenuItems obterOperacao(int opcao) {
        for (MenuItems menu : MenuItems.values()) {
//            System.out.println(menu + "  --  " + menu.codigo);
            if (opcao == menu.codigo)
                return menu;
        }
        return null;
    }

    public int getCodigo(){
        return this.codigo;
    }
}

