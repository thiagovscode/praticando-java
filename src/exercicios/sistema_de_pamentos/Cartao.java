package exercicios.sistema_de_pamentos;

public class Cartao extends Pagamento{


    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento(){

        System.out.println("Pagamento de " + getValor() + " confirmado no Cartão de Crédito (Taxa: " + calcularTaxa() +")");

    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.03;
    }
}
