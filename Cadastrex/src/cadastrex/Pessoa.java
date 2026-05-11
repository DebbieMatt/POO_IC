package cadastrex;

// Apenas Pessoa é public (nome do arquivo)
public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome()            { return nome; }
    public int getIdade()              { return idade; }
    public String getCpf()             { return cpf; }
    public void setNome(String nome)   { this.nome = nome; }
    public void setIdade(int idade)    { this.idade = idade; }
    public void setCpf(String cpf)     { this.cpf = cpf; }

    public void exibirDados() {
        System.out.println("Nome  : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("CPF   : " + cpf);
    }
}

// -------------------------------------------------------

class Estudante extends Pessoa {

    private String curso;

    Estudante(String nome, int idade, String cpf, String curso) {
        super(nome, idade, cpf);
        this.curso = curso;
    }

    public String getCurso()            { return curso; }
    public void setCurso(String curso)  { this.curso = curso; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Curso : " + curso);
    }
}

// -------------------------------------------------------

class Funcionario extends Pessoa {

    private double salario;

    Funcionario(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    public double getSalario()             { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public double getBonus() {
        return salario * 0.1;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Bônus  : R$ %.2f%n", getBonus());
    }
}

// -------------------------------------------------------

class Gerente extends Funcionario {

    Gerente(String nome, int idade, String cpf, double salario) {
        super(nome, idade, cpf, salario);
    }

    @Override
    public double getBonus() {
        return super.getBonus() + 1000;
    }

    @Override
    public void exibirDados() {
        System.out.println("[ Gerente ]");
        super.exibirDados();
    }
}
