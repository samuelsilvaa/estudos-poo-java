public class TesteAnimal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemão");
        Gato gato = new Gato("Mimi");

        cachorro.comer();
        cachorro.somDoAnimal();
        gato.somDoAnimal();


        // polimorfismo
        Animal animal1 = new Cachorro("Rex", "Pastor Alemão");
        Animal animal2 = new Gato("Mimi");

        animal1.somDoAnimal();
        animal2.somDoAnimal();



        // exercício de polimorfismo:
        // 1. array de Animal
        Animal[] animais = {
                new Cachorro("rex", "pastor alemão"),
                new Gato("mimi")
        };

        // 2. percorre o array com um for
        for(Animal animal : animais) {
            animal.somDoAnimal();
        }

    }
}
