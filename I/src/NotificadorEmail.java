package isp;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String destino, String mensagem) {
        System.out.println("Enviando email para " + destino + ": " + mensagem);
    }
}

