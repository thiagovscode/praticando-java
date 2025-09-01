import java.util.Scanner;

public class ExerciciosVariaveis {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setAltura(1.68);
        pessoa.setEstudante(true);


        System.out.println(pessoa);



        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor ");
        double valor = sc.nextDouble();
        int valorinteiro = (int) valor;
        sc.close();
        System.out.println("O valor inteiro do produto é: " + (int) valorinteiro);



    }

}