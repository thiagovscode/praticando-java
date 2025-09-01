public class ExercicioFahrenheit {

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    private int fahrenheit;



    public double calculaFahrenheit(int valor){

        return ((double) (valor * 9) / 5) + 32;


    }
}
