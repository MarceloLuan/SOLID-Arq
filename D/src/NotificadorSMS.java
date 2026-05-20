package dip;

public class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
        System.out.println("SMS enviado com sucesso");
    }
}

