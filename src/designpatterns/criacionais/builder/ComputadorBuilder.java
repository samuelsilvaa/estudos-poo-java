package designpatterns.criacionais.builder;

public class ComputadorBuilder {

    private String processador;
    private int memoriaRam;
    private String placaVideo;
    private int ssd;
    private boolean wifi;

    // configurações das informações:
    public ComputadorBuilder processador(String processador) {
        this.processador = processador;
        return this;
    }

    public ComputadorBuilder memoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
        return this;
    }

    public ComputadorBuilder placaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
        return this;
    }

    public ComputadorBuilder ssd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    public ComputadorBuilder wifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }


    //cria o computador
    public Computador build() {
        return new Computador(
                processador,
                memoriaRam,
                placaVideo,
                ssd,
                wifi
        );
    }

}
