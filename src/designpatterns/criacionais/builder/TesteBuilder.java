package designpatterns.criacionais.builder;

public class TesteBuilder {
    public static void main(String[] args) {

        Reserva reserva = new ReservaBuilder()
                .nomeCliente("Samuel")
                .dataCheckin("20/11")
                .cafeDaManha(true)
                .vistaMar(false)
                .acessoSpa(true)
                .build();

        // mostra todos os getters criado no Reserva
        System.out.println("Nome: " + reserva.getNomeCliente());
        System.out.println("Data: " + reserva.getDataCheckin());
        System.out.println("Café da manhã: " + reserva.isCafeDaManha());
        System.out.println("Vista para o mar: " + reserva.isVistaMar());
        System.out.println("Acesso ao spa: " + reserva.isAcessoSpa());
    }
}
