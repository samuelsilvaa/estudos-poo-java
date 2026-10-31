public class Produto { // classe = molde
    String nome; // atributos
    double preco;

    public Produto(String nome, double preco) { // constructor
        this.nome = nome;
        this.preco = preco;
    }

    void caracteristicas() { // método
        System.out.println("Isso é uma " + nome + " e o preço é de " + preco);
    }
}
