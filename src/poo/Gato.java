package poo;// exercício de override

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void somDoAnimal() {
        System.out.println("poo.Gato: miau");
    }

}
