package exercicios.sistema_bancario;

public class Saque extends OperacaoBancaria{


    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Saque de R$ %s realizado \n",getValor());
    }
}
