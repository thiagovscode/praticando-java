package exercicios.notificacao;

public class Sms extends Notificacao{


    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

@Override
     public void enviar(){

    System.out.printf("\nEnviando SMS para: %s \nMensagem: %s \n ",getDestinatario(),getMensagem());


     }
}
