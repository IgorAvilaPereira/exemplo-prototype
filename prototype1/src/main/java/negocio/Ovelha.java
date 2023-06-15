/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Ovelha {
    private String nome;
    private int idade;
    private String raca;
    private String nomeDono;
    
    

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

    public Ovelha clonagem() {
        Ovelha ovelha = new Ovelha();
        ovelha.setNome(this.nome);
        ovelha.setIdade(this.idade);
        ovelha.setNomeDono(this.nomeDono);
        ovelha.setRaca(this.raca);
        return ovelha;
    }
    
    
    
    
    
}
