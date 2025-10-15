import exercicios.sistema_escolar.Aluno;
import exercicios.sistema_escolar.Docente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Aluno aluno1 = new Aluno("Julia ", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio ", 17, 7.2);

        aluno1.exibirDados();
        aluno2.exibirDados();

        Docente docente1 = new Docente("Marta", 40, "Matematica");
        Docente docente2 = new Docente("Roberto ", 38, "História");


        docente1.exibirDados();
        docente2.exibirDados();

    }


}