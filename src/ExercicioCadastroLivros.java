public class ExercicioCadastroLivros {

    private String titulo;
    private String autor;
    private Integer qtdpaginas;
    private Double preco;
    private Categoria categoria;




    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getQtdpaginas() {
        return qtdpaginas;
    }

    public void setQtdpaginas(Integer qtdpaginas) {
        this.qtdpaginas = qtdpaginas;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria  getCategoria() {
        return categoria;
    }


    @Override
    public String toString() {
        return "Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + qtdpaginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoria + ".";
    }
}
