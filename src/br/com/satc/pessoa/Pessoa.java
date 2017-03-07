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
public abstract class Pessoa implements IPessoa {
    private String nome, rg, cpf, logradouro;
    private float renda;
    Pessoa(String nome, String rg, String cpf, String logradouro, float renda){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
    
}
