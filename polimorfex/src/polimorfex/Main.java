/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfex;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Primeiro teste só com quadrado e circulo
        Forma f[];
        f = new Forma[3];
        // Pai recebe referencia do filho, então pode (Circulo array de Forma não pode)
        f[0] = new Circulo(2);
        f[1] = new Quadrado(3);
        f[2] = new Triangulo(5); // adicionei depois
        
        // System.out.println -> ele próprio é sobrecarga, porque o parametro de entrada pode ser string, int, etc
        System.out.println("Loop 1");
        for (int i = 0; i< f.length; i++){
            Forma forma = f[i];
            // Compilador: objeto do tipo Forma, só posso usar o que a classe Forma permite, ou seja, getArea
            // (getPerimetro está em FormaBidimensional que é subclasse de Forma)
            System.out.println("Area: " + forma.getArea());
            // System.out.println(forma.getPerimetro()); -> não existe
            // Casting para funcionar:
            FormaBidimensional fbi = (FormaBidimensional) forma;
            System.out.println("Perimetro: " + fbi.getPerimetro());
        }
        
        // MAAAAS, como sei qual é qual no print? Se é quadrado, circulo
        System.out.println("\n\nLoop 2");
        for (int i = 0; i< f.length; i++){
            Forma forma = f[i];

            //Como printar nome, para saber se é Circulo, Quadrado? 
            // opção 1: ATRIBUTO nome em Forma String nome, getNome ... Circulo em construtor this.nome = "Circulo"
            // opção 2:
            /*
            if(forma instanceof Circulo){
               System.out.println("Circulo"); 
            }
            */
            // opção 3: Nome - todas as classes herdam da Object que são public ou protected. Ela tem getCLass
            System.out.println(forma.getClass()); // mas ele printa "class polimorfismo.Circulo"...
            System.out.println(forma.getClass().getSimpleName()); // Certinho! Printou "Circulo"
            
            
            // AREA E PERIMETRO
            System.out.println("Area: " + forma.getArea());
            FormaBidimensional fbi = (FormaBidimensional) forma;
            System.out.println("Perimetro: " + fbi.getPerimetro());
        }
        
        // Primeiro teste só com quadrado e circulo
        Forma f2[];
        f2 = new Forma[5];
        // Pai recebe referencia do filho, então pode (Circulo array de Forma não pode)
        f2[0] = new Circulo(2);
        f2[1] = new Quadrado(3);
        f2[2] = new Triangulo(5);
        f2[3] = new Esfera(5);
        f2[4] = new Cubo(5);
        
        System.out.println("\n\nLoop 3");
        for (int i = 0; i< f2.length; i++){
            // POlimorfismo está aqui, uma classe genérica pai mas que depois faço casting pra uma mais específica
            Forma forma = f2[i];
            System.out.println("\n" + forma.getClass().getSimpleName());
            System.out.println("Area: " + forma.getArea());
            // No caso, se fizer só isso agora vai quebrar porque Esfera e Cubo não são Bidimensionais:
                // FormaBidimensional fbi2 = (FormaBidimensional) forma;
                // System.out.println("Perimetro: " + fbi2.getPerimetro());
            if(forma instanceof FormaBidimensional){
                FormaBidimensional fbi = (FormaBidimensional) forma;
                System.out.println("Perimetro: " + fbi.getPerimetro());
            }
            else if (forma instanceof FormaTridimensional){
                FormaTridimensional ftri = (FormaTridimensional) forma;
                System.out.println("Volume: " + ftri.getVolume());
            }
        }
        
    }
    
}