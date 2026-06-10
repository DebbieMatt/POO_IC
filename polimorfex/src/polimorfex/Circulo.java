/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfex;

/**
 *
 * @author aluno
 */
// esse é o concreto, como não tem métodos novos, não tem que colocar eles aqui
public class Circulo extends FormaBidimensional {
    
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    // Agora faz sobreescrita (@Override), getPerimetro de FormaBidimensional e getArea de Forma
    public double getPerimetro(){
        return 2 * Math.PI * raio;
    }
    public double getArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    
    /* // Esse aqui não é sobrecarga nem sobreescrita, é um novo método! - o nome mudou
    public double getarea(){
        return Math.PI * Math.pow(raio, 2);
    }
    */
    
}
