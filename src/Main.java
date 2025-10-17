import exercicios.controle_de_reservas.Reserva;
import exercicios.controle_de_reservas.ReversaVip;
import exercicios.enviando_mensagens.Mensagem;

public class Main {
    public static void main(String[] args) {

        Reserva r = new Reserva();
        r.reservar();
        r.reservar("10/04");
        r.reservar("12/04", 4);

        Reserva vip = new ReversaVip();
        vip.reservar();
    }


}