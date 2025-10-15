package exercicios.sistema_escolar;


public class Docente extends Pessoa {

    private String disciplina;

    public Docente(String nome,int idade,String disciplina) {
        super(idade, nome);
        this.disciplina = disciplina;
    }


    public void exibirDados(){
        System.out.println("Docente: " + getNome() + " - Idade: " + getIdade() + " - Disciplina: " + disciplina);

    }

}
