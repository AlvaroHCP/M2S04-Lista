package exercicio4;

public class Idade {
    public static int validaIdade(int idade){
        if(idade <= 0 || idade > 100)
            throw new IdadeException("Idade inserida inválida.");
        return idade;
    }
}
