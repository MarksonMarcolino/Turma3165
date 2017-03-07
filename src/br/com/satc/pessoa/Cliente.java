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
     
    
    public Cliente(String nome, String rg, String cpf, String logradouro, float renda) {
        super(nome, rg, cpf, logradouro, renda);
        
        
    }

    @Override
    public String retornaDados() {
        return "nome: " + this.getNome() + "rg: " + this.getRg() + "cpf: " + this.getCpf() + "logradouro " + this.getLogradouro() + "renda: " + this.getRenda();
    }

    public void AlteraNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlteraNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
