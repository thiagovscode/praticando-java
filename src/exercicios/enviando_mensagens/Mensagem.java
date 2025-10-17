package exercicios.enviando_mensagens;

public class Mensagem {

    private String mensagem;
    private String destinatario;
    private Integer frequencia;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Integer getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Integer frequencia) {
        frequencia = frequencia;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }




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
