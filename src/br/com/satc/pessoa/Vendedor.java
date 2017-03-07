/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Edutec
 */
public abstract class Vendedor extends Funcionario{
    private float comissao;
    private String especialidade;

    public Vendedor(String nome, String rg, String cpf,float comissao) {
        super(nome, rg, cpf);
        this.setEspecialidade(especialidade);
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String retornaDados() {
        return "Nome: "+ this.getNome() + ".\n RG: "+ this.getRg()+".\n CPF: "+ this.getCpf()+ ".\n Comissão: "+ this.getComissao()+". \n Especialidade: "+ this.getEspecialidade()+"." ;
    }

    @Override
    public void AlteraNome(String Nome) {    
        this.setNome(Nome);
    }

    @Override
    public void adicionaBonus(float bonus) {
      this.setBonus(this.getBonus() + bonus);
      
    }

    @Override
    public void trocaSupervisor(Funcionario supervisor) {
        this.setSupervisor(supervisor);
    }
    
}
