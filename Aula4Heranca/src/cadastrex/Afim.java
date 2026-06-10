/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Afim {
    
    protected double a;
    protected double b;

    public Afim(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public double getY(double x){
        double y = a*x + b;
        return y;
    }
    
}
