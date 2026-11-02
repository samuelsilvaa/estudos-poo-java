public class ContaBancaria {
    private String titular;
    private double saldo;
    private String senha;


    // constructor
    public ContaBancaria(String titular, double saldo, String senha) {
        if(saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
        this.titular  = titular;
        this.senha = senha;
    }

    // consultar o titular
    public String getTitular() {
        return titular;
    }

    //consultar o saldo
    public double getSaldo() {
        return saldo;
    }

    // ação de depositar
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor invalido");
        }
    }

    //ação de sacar
    public void sacar(double valor) {
        if(valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Não foi possível sacar, valor inválido!");
        }
    }

    // trocar a senha
    public void setSenha(String novaSenha) {
        if(novaSenha.length() >= 8) {
            senha = novaSenha;
        } else {
            System.out.println("A senha deve ter no mínimo 8 caracteres");
        }
    }


}
