package designpatterns.criacionais.factory;

public class TesteFactory {

    public static void main(String[] args) {
        //criar o pedido normal
        Pedido pedidoNormal = PedidoFactory.criarPedido("normal");
        pedidoNormal.processarPedido();

        //criar pedido prioritário
        Pedido pedidoPrioritario = PedidoFactory.criarPedido("prioritario");
        pedidoPrioritario.processarPedido();
    }

}
