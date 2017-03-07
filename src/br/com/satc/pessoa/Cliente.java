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
private Double renda;
private String logradouro;

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public Cliente(String nome, String rg, String cpf, Double renda, String logradouro) {
        super(nome, rg, cpf);
        this.setRenda(renda);
        this.setLogradouro(logradouro);
    }

    @Override
    public String retornaDados() {
     String a = "O Nome do cliente: "+getNome()+", o RG do cliente: "+getRg()+", o CPF do cliente: "+getCpf()+", o logradouro do cliente: "+getLogradouro()+", a renda do cliente: R$"+getRenda()+".";
     return a;
    }

    @Override
    public void AlteraNome(String nome) {
        setNome(nome);
    }
    
}
