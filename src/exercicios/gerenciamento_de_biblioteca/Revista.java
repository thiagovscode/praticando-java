package exercicios.gerenciamento_de_biblioteca;

public class Revista extends Midia{

     Integer edicao;


    public Revista(String titulo, Integer anopub, Integer edicao) {
        super(titulo, anopub);
        this.edicao = edicao;
    }


    public void exibirInfo(){


        System.out.println("Codigo: "+geraCodigo()+" | Livro: " + getTitulo() + " - Edição:" +edicao);

    }
}
