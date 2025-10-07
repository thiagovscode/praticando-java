package variaveisetipos;

public class ExercicioConversao {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ExercicioConversao(double valor) {
        this.valor =  valor;

        System.out.println("O valor inteiro do produto é: "+ (int) this.valor);
    }
}
