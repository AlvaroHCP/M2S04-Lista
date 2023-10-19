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

    public static MenuItems obterOperacao(int opcao) {
            MenuItems retorno = null;
        try {
            retorno = converterOperacao(opcao);
            int valor = retorno.toString().length();
        } catch (OpcaoInvalidaException e) {
            System.out.println("\n" + e.getMessage());
        }
        return retorno;
    }

    private static MenuItems converterOperacao(int opcao) throws OpcaoInvalidaException {
        for (MenuItems menu : MenuItems.values()) {
//            System.out.println(menu + "  --  " + menu.codigo);
            if (opcao == menu.codigo)
                return menu;
        }
        throw new OpcaoInvalidaException("Opção selecionada inválida!\nSelecione novamente!");
    }

    public int getCodigo(){
        return this.codigo;
    }
}

