package exercicios.sistema_bancario;

public abstract class OperacaoBancaria implements AcaoBancaria{




    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }


}
