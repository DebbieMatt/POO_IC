/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
public class Quadrado extends FormaBidimensional {
    
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    // Agora faz sobreescrita (@Override), getPerimetro de FormaBidimensional e getArea de Forma
    public double getPerimetro(){
        return 4 * lado;
    }
    public double getArea(){
        return Math.pow(lado, 2);
    }
    
}
