package variaveisetipos;

public class ExercicioCategoria {



    public static String verificaPreco(double preco){
        String categoria;

        return (preco < 50) ? "Econômico"
                : (preco <= 200) ? "Intermediário"
                : "Premium";

    }





}
