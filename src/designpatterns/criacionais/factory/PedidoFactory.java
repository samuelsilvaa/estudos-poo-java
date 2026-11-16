package designpatterns.criacionais.factory;

public class PedidoFactory {

    public static Pedido criarPedido(String tipo) {
        if(tipo.equals("normal")) {
            return new PedidoNormal();
        }

        if(tipo.equals("prioritario")) {
            return new PedidoPrioritario();
        }

        return null;
    }

}
