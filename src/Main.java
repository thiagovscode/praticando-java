import exercicios.enviando_mensagens.Mensagem;

public class Main {
    public static void main(String[] args) {

        Mensagem notificacao = new Mensagem();


        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }


}