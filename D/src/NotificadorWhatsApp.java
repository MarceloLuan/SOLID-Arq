package dip;

public class NotificadorWhatsApp implements Notificador {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando WhatsApp para " + destinatario + ": " + mensagem);
        System.out.println("WhatsApp enviado com sucesso");
    }
}

