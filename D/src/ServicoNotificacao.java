package dip;

public class ServicoNotificacao {
    private Notificador notificador;

    public ServicoNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificar(String destinatario, String mensagem) {
        notificador.enviar(destinatario, mensagem);
    }
}

