package designpatterns.criacionais.singleton;

public class BancoDeDados {

    private static BancoDeDados banco;

    private BancoDeDados() {
        System.out.println("Banco de dados criado!");
    }

    public static BancoDeDados getInstancia() {
        //“Se ainda não existe, crie. Se já existe, não crie outro.”
        if(banco == null ) {
            banco = new BancoDeDados();
        }

        return banco;
    }

}


/*
*
*   PRIVATE → ninguém de fora mexe diretamente.
*   STATIC → pertence à classe e será compartilhado.
*   BancoDeDados banco → essa variável vai guardar nossa única instância.
*
* */