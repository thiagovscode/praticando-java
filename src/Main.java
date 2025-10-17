import exercicios.sistema_bancario.Deposito;
import exercicios.sistema_bancario.OperacaoBancaria;
import exercicios.sistema_bancario.Saque;

public class Main {
    public static void main(String[] args) {

        OperacaoBancaria deposito = new Deposito(200.0);
        OperacaoBancaria saque = new Saque(50.5);

        deposito.executar();
        saque.executar();


    }

}