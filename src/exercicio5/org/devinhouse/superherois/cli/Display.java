package exercicio5.org.devinhouse.superherois.cli;

import java.util.Scanner;

public class Display {
    public static void exibeMenu(){
        System.out.println("Operações disponíveis: ");
        for (MenuItems menu: MenuItems.values()) {
            System.out.println(menu.codigo + " - " + menu);
        }
        System.out.print("Escolha a operação que quer realizar: ");
    }



    public static void aguarde(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nPressione qualquer tecla para continuar.....\n");
        scanner.nextLine();
    }

    public static int recebeOpcaoUsuario(){
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        MenuItems operacao = MenuItems.obterOperacao(opcao);
        System.out.println("\n" + operacao);
        return opcao;
    }

}
