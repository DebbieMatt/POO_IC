/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfex;

/**
 *
 * @author aluno
 */
public class Cubo extends FormaTridimensional {
    
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }

    public double getArea() {
        return Math.pow(lado, 2) * 6;
    }
    
    public double getVolume(){
        return Math.pow(lado, 3);
    }
    
}
