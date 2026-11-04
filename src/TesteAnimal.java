public class TesteAnimal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemão");

        cachorro.comer(); // Método herdado de Animal
        cachorro.latir();  // Método próprio de Cachorro
    }
}
