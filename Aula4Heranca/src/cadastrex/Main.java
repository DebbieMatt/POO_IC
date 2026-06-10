/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TESTES");
        Estudante e2;
        e2 = new Estudante(); // instanciei
        // e = new Pessoa(); // não posso, nem toda Pessoa é estudante
        Pessoa f;
        f = new Estudante(); // Posso, porque é filha
        
        e2.setNome("Marlon");
        System.out.println(e2.getNome());
        
        e2.setCurso("adm");
        //f.setCurso("adm"); // erro, curso é de estudante, não pessoa
        
        // --------------------------//
        Pessoa e;
        e = new Estudante();
        e.setNome("Marlon");
        
        Estudante d;
        // d = e; não pode Estudante = Pessoa; 
        d = (Estudante)e; // só com casting, compilador passa a conseguir interpretar
        System.out.println(d.getNome());
        
        // só posso fazer se tiver certeza se não -> ClassCastException
        Estudante d2;
        if (e instanceof Estudante){
            d2 = (Estudante)e;
        }
        
        // EXERCICIO 1 --------------------------------//
        System.out.println("\nEXERCICIO 1");
        System.out.println("EXERCICIO 1.A");
        Afim0 e0;
        e0 = new Afim0(3,5,7);
        System.out.println(e0.getY());
        // a e b são atributos da classe, x representa um ponto, não a reta. então não é atributo
        
        Afim e1;
        e1 = new Afim(3,5);
        System.out.println(e1.getY(7));
        
        System.out.println("\nEXERCICIO 1.B");
        Quadratico q = new Quadratico(1,2,3);
        System.out.println(q.getY(5));
        
        System.out.println("\nEXERCICIO 1.C");
        Cubico t = new Cubico(1,2,3,4);
        System.out.println(t.getY(5));
        
        // EXERCICIO 2 --------------------------------//
        System.out.println("\nEXERCICIO 2");
       // Conta c = new Conta();
        //c.setNumero("1234-5");
        
    }
}
