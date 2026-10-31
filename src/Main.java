public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Samuel", 21);
        Pessoa pessoa2 = new Pessoa("Ana", 20);

        Produto produto1 = new Produto("Caneta", 2.90);

        pessoa1.apresentar();
        pessoa2.apresentar();
        produto1.caracteristicas();

    }
}
