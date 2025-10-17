package exercicios.sistema_de_pamentos;

public class Boleto extends Pagamento{


    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento(){
        System.out.println("Boleto de " + getValor() + " gerado com sucesso (Taxa: " + calcularTaxa() +")");


    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.01;
    }
}
