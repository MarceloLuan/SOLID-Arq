package isp;

public class NotificadorSMS implements Notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando SMS para " + destino + ": " + mensagem);
    }
}

