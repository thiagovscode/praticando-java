public class ExercicioParouImpar {

    private int numero;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public static String verificaNumero (int numero){

       return  (numero % 2 == 0) ? "Par" : "Ímpar";

    }
}
