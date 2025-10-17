package exercicios.sistema_bancario;

public class Deposito extends OperacaoBancaria{


    public Deposito(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$ %s realizado \n",getValor());
    }
}
