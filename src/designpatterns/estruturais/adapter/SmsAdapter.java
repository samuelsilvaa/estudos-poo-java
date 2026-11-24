package designpatterns.estruturais.adapter;

public class SmsAdapter implements Notificacao {
    private SmsAntigo smsAntigo;

    public SmsAdapter(SmsAntigo smsAntigo) {
        this.smsAntigo = smsAntigo;
    }

    @Override
    public void enviar() {
        smsAntigo.enviarSms();
    }

}
