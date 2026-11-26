package designpatterns.estruturais.decorator;

import designpatterns.estruturais.adapter.Notificacao;

public class CriptografiaDecorator implements Notificacao {
    private Notificacao notificacao;

    public CriptografiaDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }


    @Override
    public void enviar() {
        System.out.println("Criptografando...");

        notificacao.enviar();
    }
}
