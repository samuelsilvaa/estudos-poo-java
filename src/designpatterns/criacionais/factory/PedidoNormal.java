package designpatterns.criacionais.factory;

public class PedidoNormal extends Pedido {


    @Override
    public void processarPedido() {
        System.out.println("Processando pedido normal");
    }
}
