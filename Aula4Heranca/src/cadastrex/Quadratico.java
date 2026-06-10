/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Quadratico extends Afim {
    protected double c;

    public Quadratico(double a, double b, double c){
        super(a,b);
        this.c = c;
    }
    
    // Afim         => y = ax + b
    // Quadratico   => y = ax² + bx + c = x*(ax + b) + c = x*Afim + c
    
    @Override // porque está sobreescrevendo
    public double getY(double x){
        double y = x * super.getY(x) + c; // a*x*x + *x + c
        return y;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
}
