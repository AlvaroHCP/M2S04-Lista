package exercicio5.org.devinhouse.superherois;

import exercicio5.org.devinhouse.superherois.cli.Display;
import exercicio5.org.devinhouse.superherois.cli.MenuItems;
import exercicio5.org.devinhouse.superherois.repository.PersonagemRepository;
import exercicio5.org.devinhouse.superherois.model.Heroi;
import exercicio5.org.devinhouse.superherois.model.Vilao;

import java.util.Scanner;

public class Aplication {
    public void run() {
        int opcao;
        boolean terminarPrograma;
        do {
            Display.exibeMenu();
            opcao = Display.recebeOpcaoUsuario();
            terminarPrograma = opcao != MenuItems.SAIR.codigo;
            if(terminarPrograma)
                Display.aguarde();
            realizaOperacaoUsuario(opcao);
        } while(terminarPrograma);
    }

    private void realizaOperacaoUsuario(int opcao){
        MenuItems op = MenuItems.obterOperacao(opcao);
        Scanner scanner = new Scanner(System.in);
        switch(op){
            case CADASTRAR_HEROI -> {
                System.out.print("Digite o nome do Herói: ");
                String nome = scanner.nextLine();
                System.out.println();
                System.out.print("Digite o Superpoder do Herói: ");
                String superPoder = scanner.nextLine();
                System.out.println();
                System.out.print("Digite o Nome Real do Herói: ");
                String nomeVidaReal = scanner.nextLine();
                System.out.println();
                Heroi heroi = new Heroi(nome, superPoder, nomeVidaReal );
                PersonagemRepository.cadastrarPersonagens(heroi);
            }
            case CADASTRAR_VILAO -> {
                System.out.println("Digite o Nome do Vilao");
                String nome = scanner.nextLine();
                System.out.println();
                System.out.print("Digite o Superpoder do Vilão: ");
                String superPoder = scanner.nextLine();
                System.out.println();
                System.out.print("Digite o Tempo de Prisão do Vilão: ");
                int tempoDePrisao = scanner.nextInt();
                System.out.println();
                Vilao vilao = new Vilao(nome, superPoder, tempoDePrisao );
                PersonagemRepository.cadastrarPersonagens(vilao);
            }
            case LISTAR -> listaPersonagens(opcao);
        }
    }
    private void listaPersonagens(int numero){
        if(numero == MenuItems.LISTAR.codigo)
            System.out.println(PersonagemRepository.getCadastroDePersonagens());
        Display.aguarde();
    }
}
