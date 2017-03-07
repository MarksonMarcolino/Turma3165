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
public class Vendedor extends Funcionario implements iVendedor{
 private float comissao;
 private String especialidade;

    public Vendedor(String nome, String rg, String cpf, String logradouro, float renda, String setor, String cargo, float salario, float bonus, float comissao, String especialidade) {
        super(nome, rg, cpf, logradouro, renda, setor, cargo, salario, bonus);
        this.setComissao(comissao);
        this.setEspecialidade(especialidade);
    }
 
 

    /**
     * @return the comissao
     */
    public float getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String retornaDados() {
         return "Cpf: " + this.getCpf()+ "Nome: "+this.getNome()+ "RG: "+ this.getRg()+"Logradouro: "+this.getLogradouro()+"Renda: "+this.getRenda()+ "especialidade: "+ this.getEspecialidade()+"setor: "+this.getSetor()+"cargo: "+this.getCargo()+ "salario: " + this.getSalario()+ "bonus:"+ this.getBonus();
    }

    @Override
    public void AlteraNome(String Nome) {
        this.setNome(Nome);
    }

    @Override
    public void adicionaBonus(float bonus) {
    this.setBonus(this.getBonus()+ bonus);    
    }

    @Override
    public void trocaSupervisor(Funcionario Supervisor) {
      this.setSupervisor(Supervisor);
    }

    @Override
    public void CalculaComissao(float valor, float porcentagem) {
     this.setComissao(valor/porcentagem*100);
    }
}
