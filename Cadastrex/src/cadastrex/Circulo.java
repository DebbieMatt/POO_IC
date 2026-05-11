
package cadastrex;

public class Circulo {

    // Atributos
    private String nome;
    private double raio;

    // Métodos SET (inicializar dados)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Cálculos
    public double calcularDiametro() {
        return raio * 2;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return calcularDiametro() * Math.PI;
    }

    // Métodos GET (exibir dados)
    public String getNome() {
        return nome;
    }

    public double getRaio() {
        return raio;
    }

    public void exibirDados() {
        System.out.println("===== Círculo: " + nome + " =====");
        System.out.printf("Raio          : %.2f%n", raio);
        System.out.printf("Diâmetro      : %.2f%n", calcularDiametro());
        System.out.printf("Área          : %.2f%n", calcularArea());
        System.out.printf("Circunferência: %.2f%n", calcularCircunferencia());
    }
}