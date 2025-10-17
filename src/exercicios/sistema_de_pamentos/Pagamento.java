package exercicios.sistema_de_pamentos;

public class Pagamento {


    public Pagamento(double valor) {
        this.valor = valor;
    }

    private double valor;


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public void confirmarPagamento(){

        System.out.printf("Pagamento de R$%.2f confirmado\n",
                valor, calcularTaxa());


    }

    public double calcularTaxa() {
        return valor * 0.0;
    }
}
