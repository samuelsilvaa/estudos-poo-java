public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override // serve para sobrescrever uma ação herdada da classe pai
    public void comer() {
        System.out.println("O cachorro está comendo");
    }

    @Override // nome da ação precisa ser o mesmo que está na classe pai
    public void somDoAnimal() {
        System.out.println("Cachorro: Au Au");
    }


}
