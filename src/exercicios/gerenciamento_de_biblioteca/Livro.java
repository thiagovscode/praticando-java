package exercicios.gerenciamento_de_biblioteca;

public class Livro extends Midia{


    private String autor;

    public Livro(String titulo, Integer anopub, String autor) {
        super(titulo, anopub);
        this.autor = autor;
    }


    public void exibirInfo(){


        System.out.println("Codigo: "+geraCodigo()+" | Livro: " + getTitulo() + " - Autor: " +autor);

    }
}
