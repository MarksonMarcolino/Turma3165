/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Vinícius
 */
public class Cliente extends Pessoa {
    private float renda;
    private String logradouro;

    public float getRenda() {
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

    public Cliente(String nome, String rg, String cpf, float renda, String logradouro) {
        super(nome, rg, cpf);
        this.logradouro = logradouro;
        this.renda = renda;
    }

    @Override
    public String retornaDados() {
        String dados = "Nome: "+ this.getNome()+
                       "\nRG: "+ this.getRg()+
                       "\nCPF: "+ this.getCpf()+
                       "\nLogradouro: "+ this.getLogradouro()+
                       "\nRenda: "+ this.getRenda();
                       
                return dados;
    }

    @Override
    public void AlteraNome(String novoNome) {
        this.setNome(novoNome);
    }
    
}
