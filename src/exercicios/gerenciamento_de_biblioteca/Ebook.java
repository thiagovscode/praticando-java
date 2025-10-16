package exercicios.gerenciamento_de_biblioteca;

public class Ebook extends Midia{


    private String formato;


    public Ebook(String titulo, Integer anopub, String formato) {
        super(titulo, anopub);
        this.formato = formato;
    }


    public void exibirInfo(){


        System.out.println("Codigo: "+geraCodigo()+" | Livro: " + getTitulo() + " - Formato:" +formato);

    }
}
