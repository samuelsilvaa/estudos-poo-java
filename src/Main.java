public class Main {
    public static void main(String[] args) {
        // atividade ContaBancaria
        // Exercício de encapsulamento



        //Criando a conta
        ContaBancaria conta = new ContaBancaria("Samuel", 1000, "senha12345");

        // Consultar dados
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());

        // Depositar
        conta.depositar(500);

        // Sacar
        conta.sacar(200);

        // Consultar saldo atualizado
        System.out.println("Saldo atual: " + conta.getSaldo());

        // Testar operações inválidas
        conta.sacar(2000);
        conta.depositar(-200);

        // Alterar senha
        conta.setSenha("123");
    }
}