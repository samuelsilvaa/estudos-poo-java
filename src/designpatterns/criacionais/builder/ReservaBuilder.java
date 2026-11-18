package designpatterns.criacionais.builder;

// prepara os dados para criar a Reserva
public class ReservaBuilder {
    private String nomeCliente;
    private String dataCheckin;
    private boolean cafeDaManha;
    private boolean vistaMar;
    private boolean acessoSpa;


    //configuração de cada informação:
    public ReservaBuilder nomeCliente(String nome) {
        this.nomeCliente = nome;
        return this; //representa o próprio Builder atual.
    }

    public ReservaBuilder dataCheckin(String data) {
        this.dataCheckin = data;
        return this;
    }

    public ReservaBuilder cafeDaManha(boolean cafeManha) {
        this.cafeDaManha = cafeManha;
        return this;
    }

    public ReservaBuilder vistaMar(boolean vistaDoMar) {
        this.vistaMar = vistaDoMar;
        return this;
    }

    public ReservaBuilder acessoSpa(boolean acessoDoSpa) {
        this.acessoSpa = acessoDoSpa;
        return this;
    }


    // o build vai criar a Reserva
    public Reserva build() {
        return new Reserva(
                nomeCliente,
                dataCheckin,
                cafeDaManha,
                vistaMar,
                acessoSpa
        );
    }
}
