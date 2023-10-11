package exercicio4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Digite sua idade: ");
            int idade = Idade.validaIdade(scanner.nextInt());
            System.out.println("Olá, você tem " + idade + " anos de idade!");
        } catch(IdadeException e){
            System.out.println();
            e.printStackTrace();
            System.out.println();
            System.out.println(e.getMessage());
        }
    }
}
