package dip;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando email para " + destinatario + ": " + mensagem);
        System.out.println("Email enviado com sucesso");
    }
}

