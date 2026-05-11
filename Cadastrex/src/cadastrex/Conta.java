
package cadastrex;

public class Conta {
    private String nome;
    private String cpf;   // String para preservar zeros à esquerda (ex: 012.345.678-90)
    private float saldo;
    
    // Métodos SET (inicializar dados)
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    // Métodos GET (exibir dados)
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public float getSaldo() {
        return saldo;
    }
    
    // Operações bancárias
 
    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor de depósito inválido. Informe um valor positivo.");
        }
    } 
    public void sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido. Informe um valor positivo.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        }
    }
 
    public void exibirDados() {
        System.out.println("===== Dados da Conta =====");
        System.out.println("Nome  : " + nome);
        System.out.println("CPF   : " + cpf);
        System.out.printf("Saldo : R$ %.2f%n", saldo);
    }
}
