package designpatterns.criacionais.singleton;

public class TesteSingleton {
    public static void main(String[] args) {

        //“BancoDeDados, me entregue a instância que você controla.”
        BancoDeDados banco1 = BancoDeDados.getInstancia();
        BancoDeDados banco2 = BancoDeDados.getInstancia();
        // banco1 e banco2 são duas variáveis que apontam para a mesma instância

        System.out.println(banco1 == banco2);
        System.out.println(banco1);
        System.out.println(banco2);

    }
}
