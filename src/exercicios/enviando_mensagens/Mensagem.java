package exercicios.enviando_mensagens;

public class Mensagem {


    public void enviarMensagem(String mensagem){

        System.out.println("Mensagem enviada para todos: "+ mensagem);

    };


    public void enviarMensagem( String destinatario,String mensagem){

        System.out.println("Mensagem para "+ destinatario + ":"+ mensagem);

    };

    public void enviarMensagem( String destinatario,String mensagem, Integer frequencia){

        while(frequencia>0) {
            System.out.println("Mensagem para " + destinatario + ":" + mensagem);
         frequencia--;
        }
    };


}
