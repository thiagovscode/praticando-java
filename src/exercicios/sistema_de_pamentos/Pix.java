package exercicios.sistema_de_pamentos;

public class Pix extends Pagamento{


    public Pix(double valor) {
        super(valor);
    }


    @Override
    public void confirmarPagamento(){

        System.out.println("Pagamento via Pix de " + getValor() + "confirmado");


    }
}
