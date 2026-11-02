public class TestePessoa {
        public static void main(String[] args) {
            Pessoa pessoa1 = new Pessoa("Samuel", 21);
            Pessoa pessoa2 = new Pessoa("Ana", 20);

            System.out.println(pessoa1.getNome());

            pessoa1.setIdade(25);
            System.out.println("Idade: " + pessoa1.getIdade());

            pessoa1.apresentar();
            pessoa2.apresentar();
        }
}

