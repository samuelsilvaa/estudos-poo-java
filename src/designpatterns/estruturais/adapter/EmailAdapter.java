package designpatterns.estruturais.adapter;

public class EmailAdapter implements Notificacao {
    private EmailAntigo emailAntigo;

    public EmailAdapter(EmailAntigo emailAntigo) {
        this.emailAntigo = emailAntigo;
    }

    @Override
    public void enviar() { // coração do adapter
        emailAntigo.enviarEmail();
    }

}
