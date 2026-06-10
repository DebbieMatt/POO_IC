/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Cubico extends Quadratico {
    protected double d;

    // ax³ + bx² +cx + d;
    public Cubico(double a, double b, double c, double d){
        super(a,b,c);
        this.d = d;
    }
    
    // Afim         => y = ax + b
    // Quadratico   => y = ax² + bx + c = x*(ax + b) + c = x*Afim + c
    // Terceiro     => y = ax³ + bx² +cx + d = x*Quadratico + d

    
    @Override
    public double getY(double x){
        return x * super.getY(x) + d;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
}
