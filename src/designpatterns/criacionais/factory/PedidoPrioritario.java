package designpatterns.criacionais.factory;

public class PedidoPrioritario extends Pedido {

    @Override
    public void processarPedido() {
        System.out.println("Processando pedido Prioritário");
    }
}
