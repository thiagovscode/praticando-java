package exercicios.notificacao;

public class Push extends Notificacao {


    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    @Override
    public void enviar(){

        System.out.printf("\nEnviando Push para: %s \nTitulo: %s \nConteudo: %s \n",getDestinatario(),getTitulo(),getMensagem());
    }



}
