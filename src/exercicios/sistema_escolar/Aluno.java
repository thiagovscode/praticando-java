package exercicios.sistema_escolar;

public class Aluno extends Pessoa {
     double nota;


    public Aluno(String nome,Integer idade,Double nota) {
        super(idade, nome);
        this.nota = nota;
    }


     public void exibirDados(){
         System.out.println("Aluno: " + getNome() + " - Idade: " + getIdade() + " - Nota: " + nota);

     }

}
