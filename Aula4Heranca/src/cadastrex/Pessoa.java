/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    // Construtores
    public Pessoa(){
        
    }
    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    // Get e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
    /*
    public void setIdade(int idade) {
        this.idade = idade;
    }*/

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    

    
    
}
