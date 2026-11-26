package designpatterns.estruturais.decorator;

import designpatterns.estruturais.adapter.EmailAntigo;

public class TesteDecorator {
    public static void main(String[] args) {
        //email:
        Email email = new Email();

        LogDecorator log = new LogDecorator(email);

        //criptografia:
        CriptografiaDecorator criptografia = new CriptografiaDecorator(log);

        criptografia.enviar();

    }
}
