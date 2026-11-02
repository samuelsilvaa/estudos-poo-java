public class TesteProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Caneta", 2.90);
        Produto produto2 = new Produto("Notebook", 3000);
        Produto produto3 = new Produto("Mouse", 150);

        produto1.caracteristicas();
        produto2.caracteristicas();
        produto3.caracteristicas();
    }

}
