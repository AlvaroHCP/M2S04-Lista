package exercicio5.org.devinhouse.superherois.cli;

import exercicio5.org.devinhouse.superherois.exception.OpcaoInvalidaException;

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

//    public static MenuItems obterOperacao(int opcao) {
//            MenuItems retorno = null;
//        try {
//            retorno = converterOperacao(opcao);
//            int valor = retorno.toString().length();
//        } catch (OpcaoInvalidaException e) {
//            System.out.println("\n" + e.getMessage());
//        }
//        return retorno;
//    }

    public static MenuItems obterOperacao(int opcao) throws OpcaoInvalidaException {
        for (MenuItems menu : MenuItems.values()) {
//            System.out.println(menu + "  --  " + menu.codigo);
            if (opcao == menu.codigo)
                return menu;
        }
        throw new OpcaoInvalidaException("A opção selecionada '" + opcao + "' é uma opção inválida!" +
                "\nSó podem ser escolhidos os números de " + MenuItems.CADASTRAR_HEROI.codigo +
                " a " + MenuItems.SAIR.codigo + "!");
    }

    public int getCodigo(){
        return this.codigo;
    }
}

