package designpatterns.criacionais.builder;

// exercício de builder
public class Computador {

    private String processador;
    private int memoriaRam;
    private String placaVideo;
    private int ssd;
    private boolean wifi;

    // construtor:
    public Computador(String processador, int memoriaRam, String placaVideo, int ssd, boolean wifi) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.placaVideo = placaVideo;
        this.ssd = ssd;
        this.wifi = wifi;
    }


    // criando os getters
    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public int getSsd() {
        return ssd;
    }

    public boolean isWifi() {
        return wifi;
    }

}
