package exercicios.controle_de_reservas;

public class Reserva {


    public void  reservar(){

        System.out.println("Reserva realizada");


    }



    public void  reservar(String data){

        System.out.println("Reserva feita para o dia " +data);

    }


    public void  reservar(String data, Integer qtde){

        System.out.println("Reserva feita para o dia " +data+" para " +qtde+ " pessoas.");

    }
}
