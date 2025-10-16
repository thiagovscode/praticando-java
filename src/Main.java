import exercicios.notificacao.Email;
import exercicios.notificacao.Push;
import exercicios.notificacao.Sms;

public class Main {
    public static void main(String[] args) {

    Email email = new Email("cliente@exemplo.com","Promoção especial!  ","Aproveite nossos descontos esta semana.  ");
    Sms sms = new Sms("(11) 98765-4321","Sua fatura foi paga com sucesso." );
    Push push = new Push("usuario_app","Você tem uma nova mensagem não lida.  ","Novidade!");

    email.enviar();
    sms.enviar();
    push.enviar();

    }


}