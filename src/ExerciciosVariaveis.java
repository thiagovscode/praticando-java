import java.util.Scanner;

public class ExerciciosVariaveis {

    public static void main(String[] args) {

        System.out.println("====== Exercicio 1 ======");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setAltura(1.68);
        pessoa.setEstudante(true);


        System.out.println(pessoa);

        System.out.println("====== Exercicio 2 ======");
        ExercioConversao exercioConversao = new ExercioConversao(19.50);




    }

}