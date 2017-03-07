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

    public Cliente(String nome, String rg, String cpf,float renda,String logradouro) {
        super(nome, rg, cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
    }

    @Override
    public String retornaDados() {
         return "Nome: "+this.getNome()+".\n RG: "+this.getRg()+".\n CPF: "
         +this.getCpf()+".\n Renda: "+this.getRenda()+
         ". \n Logradouro: "+ this.getLogradouro()+".";
    }

    @Override
    public void AlteraNome(String Nome) {
        this.setNome(Nome);
    }
    
}
