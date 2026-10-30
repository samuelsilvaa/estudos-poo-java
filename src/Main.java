public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Samuel";
        pessoa1.idade = 21;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Fulano";
        pessoa2.idade = 33;

        pessoa1.apresentar();
        pessoa2.apresentar();

    }
}
