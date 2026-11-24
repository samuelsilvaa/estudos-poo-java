package designpatterns.estruturais.adapter;

public class TesteAdapter {

    public static void main(String[] args) {
        // fluxo do adapter:
        EmailAntigo email = new EmailAntigo();

        Notificacao notificacao = new EmailAdapter(email);

        notificacao.enviar();



        // teste sms:
        SmsAntigo sms = new SmsAntigo();

        Notificacao notificacao1 = new SmsAdapter(sms);

        notificacao1.enviar();


    }

}
