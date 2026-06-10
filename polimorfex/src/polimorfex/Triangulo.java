/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfex;

/**
 *
 * @author aluno
 */
public class Triangulo extends FormaBidimensional {
    
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    public Triangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado2;
    }
    
    public Triangulo(double lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
        this.lado3 = lado1;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    
    // Agora faz sobreescrita (@Override), getPerimetro de FormaBidimensional e getArea de Forma
    public double getPerimetro(){
        return lado1 + lado2 + lado3;
    }
    public double getArea(){
        double p = getPerimetro()/2;
        return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
    }
    
}
