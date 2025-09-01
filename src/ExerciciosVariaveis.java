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

        System.out.println("====== Exercicio 3 ======");
        ExercicioNotas n1 = new ExercicioNotas();
        double media = n1.calculaMedia(7.5, 8.0, 9.0);
        System.out.println(media);


        System.out.println("====== Exercicio 4 ======");
        ExercicioFahrenheit f1 = new ExercicioFahrenheit();
        double valor = f1.calculaFahrenheit(20);
        System.out.println("A temperatura em graus Fahrenheit é:"+ valor);
    }

}