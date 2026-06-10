/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
public class Esfera extends FormaTridimensional {
    
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public double getArea(){
        return 4 * Math.PI * Math.pow(raio, 2);
    }
    
    public double getVolume(){
        return (4/3) * Math.PI * Math.pow(raio, 3);
    }
    
}
