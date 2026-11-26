package designpatterns.estruturais.decorator;

import designpatterns.estruturais.adapter.Notificacao;

public class LogDecorator implements Notificacao {

    private Notificacao notificacao;

    // o LogDecorator recebe uma notificação que ele precisa guardar:
    public LogDecorator(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void enviar(){
        System.out.println("Registrando o log...");

        // agora a notificação faz o trabalho dela:
        notificacao.enviar();
    }


}

/*
*
            LogDecorator.enviar()
                    ↓
            "Registrando o log..."
                    ↓
            notificacao.enviar()
                    ↓
            Email.enviar()
                    ↓
            "Enviando e-mail..."
*
* */