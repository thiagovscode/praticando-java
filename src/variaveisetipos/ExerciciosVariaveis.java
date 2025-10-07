package variaveisetipos;

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
        ExercicioConversao exercioConversao = new ExercicioConversao(19.50);

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
        System.out.println("variaveisetipos.Categoria do produto: " + resultado );


        System.out.println("====== Exercicio 7 ======");

        String numero = ExercicioParouImpar.verificaNumero(7);
        System.out.println("O número é "+ numero);

        System.out.println("====== Exercicio 8 ======");
        double BRtoUSD = ExercicioConversorMoedas.converteMoedas(451.50);
        System.out.println("O valor em dólares é: US$ "+ BRtoUSD);

        System.out.println("====== Exercicio 9 ======");
        int idade = 17;
        String mensagem;
            if (idade >= 18) {
                 mensagem = "Você é maior de idade.";
            } else {
                 mensagem = "Você é menor de idade.";
            }

            System.out.println(mensagem);

        System.out.println("====== Exercicio 10 ======");

        ExercicioViagem v1 = new ExercicioViagem();
        v1.setConsumoMedio(12.5);
        v1.setCapacidadeTanque(50);
        v1.setCombustivelAtual(20);
        v1.setDistanciaViagem(200);
        v1.resumoImprimir();
        System.out.println();
    }



}