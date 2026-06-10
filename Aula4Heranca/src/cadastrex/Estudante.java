/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Estudante extends Pessoa {

    private String curso;
    
    public Estudante() {
        // private String cpf;    protected int idade;
        // super.idade -> só ele disponível
        //super();
        super("Padrão","cpf teste", 20);
    }
    
    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
