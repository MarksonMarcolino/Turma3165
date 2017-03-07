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

    
    public String retornaDados() {
     return "Cpf: " + this.getCpf()+ "Nome: "+this.getNome()+ "RG: "+ this.getRg()+"Logradouro: "+this.getLogradouro()+"Renda: "+this.getRenda();
    }


    @Override
    public void AlteraNome(String Nome) {
    this.setNome(Nome);
    }
}
