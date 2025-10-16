package exercicios.gerenciamento_de_biblioteca;

public class Midia {

    private String titulo;
    private Integer anopub;



    public Midia(String titulo, Integer anopub) {
        this.titulo = titulo;
        this.anopub = anopub;

    }





    public String geraCodigo(){
        String  codigo = "LIB-"+titulo.substring(0,3) + anopub;

      return codigo;

    }






    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnopub() {
        return anopub;
    }

    public void setAnopub(Integer anopub) {
        this.anopub = anopub;
    }


}
