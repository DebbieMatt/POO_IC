/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operator;

import java.util.Scanner;

/**
 *
 * @author ufmt
 */
public class Menu {
    private Scanner scanner;
    private int opcao;
    private int inicio = 0;
    
    public Menu (Scanner scanner){
        this.scanner = scanner;
    }
    public void executar(){
        while(inicio == 0 || opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4){
            mostrarMenu();
            lerOpcao();
            executarOpcaoSelecionada();
        }
        // professor: do{...} while(opcao !=0)
    }

    private void mostrarMenu(){
        System.out.println("");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
    }
    private void lerOpcao(){
         opcao = scanner.nextInt();
         inicio = 1;
    }
    private void executarOpcaoSelecionada(){
        switch(opcao){
            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            default:
                System.out.println("Escolha uma opção válida!");
                break;
        }
    }
    private void somar(){
        calcular(new Soma());
        /*
        System.out.println("Numero 1:");
        double a = scanner.nextDouble();
        System.out.println("Numero 2: ");
        double b = scanner.nextDouble();
        Soma c = new Soma();
        System.out.print("Resultado: ");
        System.out.println(c.calcular(a, b));
        */
    }
    private void subtrair(){
        calcular(new Subtracao());
        /*
        System.out.println("Numero 1: ");
        double a = scanner.nextDouble();
        System.out.println("Numero 2: ");
        double b = scanner.nextDouble();
        Subtracao c = new Subtracao();
        System.out.print("Resultado: ");
        System.out.println(c.calcular(a, b));
        */
    }
    private void multiplicar(){
        System.out.println("Numero 1: ");
        double a = scanner.nextDouble();
        System.out.println("Numero 2: ");
        double b = scanner.nextDouble();
        Multiplicacao c = new Multiplicacao();
        System.out.print("Resultado: ");
        System.out.println(c.calcular(a, b));
    }
    private void dividir(){
        System.out.println("Numero 1: ");
        double a = scanner.nextDouble();
        System.out.println("Numero 2: ");
        double b = scanner.nextDouble();
        Divisao c = new Divisao();
        System.out.print("Resultado: ");
        System.out.println(c.calcular(a, b));
        // como fazer: depois que vi
        // System.out.println("Resultado: " + c.calcular(a, b));
    }
    private void calcular(OperacaoMatematica operacao){
        System.out.println("Numero 1: ");
        double a = scanner.nextDouble();
        System.out.println("Numero 2: ");
        double b = scanner.nextDouble();
        double c = operacao.calcular(a, b);
        System.out.print("Resultado: " + c);
    }
}
