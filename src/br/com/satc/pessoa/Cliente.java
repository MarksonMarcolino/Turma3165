/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Markson
 */
public class Cliente extends Pessoa {
    
            private float renda;
            private String logradouro;


    public Cliente(String nome, String rg, String cpf, String logradouro, float renda) {
        super(nome, rg, cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
        
    }    
        
    public String retornaDados(String vlt) {
        vlt = "Dados:\nNome: " + getNome() + "\nRG: " + getRg() + "\nCpf: " + getCpf() + "\nLogradouro: " + getLogradouro() + "\nRenda: " + getRenda();
        return vlt;   
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

 
    
}
