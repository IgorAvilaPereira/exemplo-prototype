/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iapereira
 */
public class Ovelha implements Cloneable {
    private String nome;
    private int idade;
    private String raca;
    private String nomeDono;
    
//    private Ovelha(){
//    }  
//    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    @Override
    public String toString() {
        return "Ovelha{" + "nome=" + nome + ", idade=" + idade + ", raca=" + raca + ", nomeDono=" + nomeDono + '}';
    }
    
    @Override
    public Ovelha clone() throws CloneNotSupportedException{
        try {
            return (Ovelha) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Ovelha.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

//    public Ovelha clonagem() {
//        Ovelha ovelha = new Ovelha();
//        ovelha.setNome(this.nome);
//        ovelha.setIdade(this.idade);
//        ovelha.setNomeDono(this.nomeDono);
//        ovelha.setRaca(this.raca);
//        return ovelha;
//    }
//    
//    
    
    
    
}
