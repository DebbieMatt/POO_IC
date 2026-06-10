/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operator;

import java.util.Scanner;

/**
 *
 * @author ufmt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        /*
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        
        int opcao = teclado.nextInt();
        int a, b;
        switch(opcao){
            case 1:
                System.out.println("Numero 1: ");
                a = teclado.nextInt();
                System.out.println("Numero 2: ");
                b = teclado.nextInt();
                Soma c = new Soma();
                System.out.println("Resultado: ");
                System.out.print(c.calcular(a, b));
                break;
            case 2:
                System.out.println("Numero 1: ");
                a = teclado.nextInt();
                System.out.println("Numero 2: ");
                b = teclado.nextInt();
                Subtracao d = new Subtracao();
                System.out.println("Resultado: ");
                System.out.print(d.calcular(a, b));
                break;

            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Escolha ua opção válida!");
        }
        */
        Menu menu = new Menu(teclado);
        menu.executar();
        
        
    }
    
}
