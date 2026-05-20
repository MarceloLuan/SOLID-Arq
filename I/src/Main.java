package isp;

public class Main {
    public static void main(String[] args) {
        GerenciadorPedidos pedidos = new GerenciadorPedidos();
        GerenciadorEntregas entregas = new GerenciadorEntregas();

        Notificador email = new NotificadorEmail();
        Notificador sms = new NotificadorSMS();

        RelatorioGenerator relatorio = new RelatorioVendas();

        Pedido p = new Pedido("200", "Ana", 58.00);
        pedidos.salvar(p);
        entregas.agendar(p.getId(), "Rua A, 123");

        email.enviar("ana@example.com", "Seu pedido foi confirmado");
        sms.enviar("+5511999999999", "Pedido a caminho");

        System.out.println(relatorio.gerar());
    }
}

