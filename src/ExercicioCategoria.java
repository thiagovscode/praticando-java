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

        if(preco < 50){
            categoria = "Econômico";
        }

        else if(preco >=50 && preco<=200 ){
            categoria= "Intermediário";

        } else {
            categoria = "Premium";
        }

        return categoria;

    }





}
