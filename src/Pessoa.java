public class Pessoa

{
    private String nome;
    private Integer idade;
    private Double altura;
    private Boolean estudante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getEstudante() {
        return estudante;
    }

    public void setEstudante(Boolean estudante) {
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return
                "  Nome='" + nome + "',\n" +
                "  Idade=" + idade + ",\n" +
                "  Altura=" + altura + ",\n" +
                "  Estudante=" + estudante + "\n";
    }

}
