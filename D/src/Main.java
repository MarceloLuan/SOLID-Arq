package dip;

public class Main {
    public static void main(String[] args) {
        ServicoNotificacao servicoEmail = new ServicoNotificacao(new NotificadorEmail());
        servicoEmail.notificar("ana@example.com", "Pedido confirmado");

        System.out.println();

        ServicoNotificacao servicoSMS = new ServicoNotificacao(new NotificadorSMS());
        servicoSMS.notificar("+5511987654321", "Seu pedido foi enviado");

        System.out.println();

        ServicoNotificacao servicoWhatsApp = new ServicoNotificacao(new NotificadorWhatsApp());
        servicoWhatsApp.notificar("+5511987654321", "Rastreie seu pedido aqui");
    }
}

