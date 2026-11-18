package designpatterns.criacionais.builder;

public class TesteComputadorBuilder {
    public static void main(String[] args) {
        Computador computador = new ComputadorBuilder()
                .processador("Ryzen 5")
                .memoriaRam(16)
                .placaVideo("RTX 4060")
                .ssd(512)
                .wifi(true)
                .build();


        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Memória RAM: " + computador.getMemoriaRam());
        System.out.println("Placa de video: " + computador.getPlacaVideo());
        System.out.println("SSD: " + computador.getSsd());
        System.out.println("Wifi: " + computador.isWifi());
    }


}
