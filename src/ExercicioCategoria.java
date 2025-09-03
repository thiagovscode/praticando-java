public class ExercicioCategoria {

    private double preco;



    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public static String verificaPreco(double preco){
        String categoria;

        return (preco < 50) ? "Econômico"
                : (preco <= 200) ? "Intermediário"
                : "Premium";

    }





}
