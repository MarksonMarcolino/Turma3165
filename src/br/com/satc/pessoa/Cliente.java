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

    public Cliente(String nome, String rg, String cpf, float renda, String logradouro) {
        super(nome, rg, cpf);
        this.setRenda(renda);
        this.setLogradouro(logradouro);
    }

    @Override
    public String retornaDados() {
        return "neme:"+getNome()+"rg:"+getRg()+"cpf:"+getCpf()+"renda:"+getRenda()+"logradouro:"+getLogradouro();
    }

    @Override
    public void AlteraNome(String nome) {
        setNome(nome);
    }

    /**
     * @return the renda
     */
    public float getRenda() {
        return renda;
    }

    /**
     * @param renda the renda to set
     */
    public void setRenda(float renda) {
        this.renda = renda;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
}
