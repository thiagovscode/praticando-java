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


        System.out.println("====== Exercicio 5 ======");
        ExercicioCadastroLivros l1 = new ExercicioCadastroLivros();
        l1.setTitulo("O Pequeno Príncipe");
        l1.setAutor("Antoine de Saint-Exupéry");
        l1.setQtdpaginas(96);
        l1.setPreco(39.90);
        l1.setCategoria(Categoria.fromCodigo("F"));


        System.out.println(l1);


        System.out.println("====== Exercicio 6 ======");

        String resultado = ExercicioCategoria.verificaPreco(49);
        System.out.println("Categoria do produto: " + resultado );


        System.out.println("====== Exercicio 7 ======");

        String numero = ExercicioParouImpar.verificaNumero(7);
        System.out.println("O número é "+ numero);

    }

}