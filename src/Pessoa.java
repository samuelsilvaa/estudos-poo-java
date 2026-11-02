public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) { //constructor
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Ola, sou o " + nome + " e tenho " + idade + " anos");
    }

    public String getNome() { // Getter, retorna o valor
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) { // Setter, altera o valor
        if(idade >= 0) { // só modifica apenas se idade foi maior ou igual a zero
            this.idade = idade;
        } else {
            System.out.println("idade invalida");
        }
    }
}
