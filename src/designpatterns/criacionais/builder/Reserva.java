package designpatterns.criacionais.builder;

// objeto final
public class Reserva {
    private String nomeCliente;
    private String dataCheckin;
    private boolean cafeDaManha;
    private boolean vistaMar;
    private boolean acessoSpa;


    // o objeto vai ser criado a partir desse construtor
    public Reserva(String nomeCliente, String dataCheckin, boolean cafeDaManha,
                   boolean vistaMar, boolean acessoSpa) {

        this.nomeCliente = nomeCliente;
        this.dataCheckin = dataCheckin;
        this.cafeDaManha = cafeDaManha;
        this.vistaMar = vistaMar;
        this.acessoSpa = acessoSpa;

    }

    //cria getters para mostrar no TesteBuilder, porque os atributos são private:
    public String getNomeCliente(){
        return nomeCliente;
    }

    public String getDataCheckin() {
        return dataCheckin;
    }

    //Por qual razão usar o "is": É café da manhã? → isCafeDaManha()
    public boolean isCafeDaManha() {
        return cafeDaManha;
    }

    public boolean isVistaMar() {
        return vistaMar;
    }

    public boolean isAcessoSpa() {
        return acessoSpa;
    }
}
