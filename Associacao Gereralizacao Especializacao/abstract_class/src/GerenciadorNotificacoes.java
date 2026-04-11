import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void main(String[] args){
        ArrayList<CanalNotificacao> notificacoes = new ArrayList<CanalNotificacao>();

        notificacoes.add(new Email("João", "Seja Bem-Vindo.", "Boas Vindas"));
        notificacoes.add(new Sms("Pedro", "Seu número será bloqueado por falta de saldo.", 123456789));
        notificacoes.add(new WhatsApp("Mário", "Eai, beleza?", "Não lido."));

        for(CanalNotificacao mensagem: notificacoes){
            mensagem.enviar();
        }
    }
}