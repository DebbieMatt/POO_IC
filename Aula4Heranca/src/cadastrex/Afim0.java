/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Afim0 {
    
    protected double a;
    protected double b;
    protected double x;

    public Afim0(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }
    
    public double getA(){
        return a;
    }

    public double getB() {
        return b;
    }

    public double getX() {
        return x;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    public double getY(){
        double y = a*x + b;
        return y;
    }
    
}
