
package cadastrex;

public class Main {

    public static void main(String[] args) {

        // Instanciando o primeiro círculo
        Circulo c1 = new Circulo();
        c1.setNome("Círculo A");
        c1.setRaio(5.0);

        // Instanciando o segundo círculo
        Circulo c2 = new Circulo();
        c2.setNome("Círculo B");
        c2.setRaio(3.5);

        // Exibindo os dados de cada círculo
        c1.exibirDados();
        System.out.println();
        c2.exibirDados();
        System.out.println();

        // Comparando as áreas
        System.out.println("===== Comparação de Áreas =====");
        if (c1.calcularArea() > c2.calcularArea()) {
            System.out.printf("%s possui a maior área: %.2f%n",
                    c1.getNome(), c1.calcularArea());
        } else if (c2.calcularArea() > c1.calcularArea()) {
            System.out.printf("%s possui a maior área: %.2f%n",
                    c2.getNome(), c2.calcularArea());
        } else {
            System.out.println("Os dois círculos possuem áreas iguais.");
        }
        
        Conta c3 = new Conta();
        c3.setNome("Maria Silva");
        c3.setCpf("123.456.789-00");
        c3.setSaldo(1000.0f);
 
        c3.exibirDados();
        System.out.println();
 
        c3.depositar(500.0f);
        c3.sacar(200.0f);
        c3.sacar(2000.0f); // tentativa com saldo insuficiente
 
        System.out.println();
        c3.exibirDados();
        
        Estudante e = new Estudante("Ana Lima", 20, "111.222.333-44", "Ciência da Computação");
        Funcionario f = new Funcionario("Carlos Souza", 35, "555.666.777-88", 4000.0);
        Gerente g = new Gerente("Beatriz Costa", 42, "999.000.111-22", 8000.0);

        System.out.println("===== Estudante =====");
        e.exibirDados();

        System.out.println("\n===== Funcionário =====");
        f.exibirDados();

        System.out.println("\n===== Gerente =====");
        g.exibirDados();
        
    }
}