/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfex;

/**
 *
 * @author aluno
 */
// aula 6 tornou abstract (porque não existe um objeto forma, não faz sentido: Forma b = new Forma())
// agora vira interface
public abstract class Forma {
    
    /*
    public double getArea(){
        return 0;
    }*/
    public abstract double getArea(); // aí quebrou forma bi e tridimensional
    
}
