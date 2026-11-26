package designpatterns.estruturais.decorator;

import designpatterns.estruturais.adapter.Notificacao;

public class Email implements Notificacao {

    @Override
    public void enviar() {
        System.out.println("Enviando email...");
    }
}
