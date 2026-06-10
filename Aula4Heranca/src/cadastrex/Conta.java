/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrex;

/**
 *
 * @author aluno
 */
public class Conta {

    protected String numero;
    protected double saldo;
    
    // metodo, ação, nomear no infinitivo
    public boolean sacar (double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    
    public double depositar (double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0;
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

}
