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
public class Vendedor extends Funcionario implements IVendedor{
    private float comissao;
    private String especialidade;

    public Vendedor(String nome, String rg, String cpf, String logradouro, float renda, String Setor, String Cargo, float Salario, float bonus, String especialidade) {
        super(nome, rg, cpf, logradouro, renda, Setor, Cargo, Salario, bonus);
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
    
    public void AlteraNome(String nome) {
    this.setNome(nome);
    }
    
    public String retornaDados() {
    return "Cpf: "+this.getCpf()+" Nome: "+this.getNome()+" RG: "+this.getRg()+"Logradouro: "+this.getLogradouro()+"Renda: "+this.getRenda()+"Setor: "+this.getSetor()+"Cargo: "+this.getCargo()+"Salario: "+this.getSalario()+"Bonus: "+this.getBonus()+"Especialidade: "+this.getEspecialidade();
    }
    
    public void adicionaBonus(float bonus) {
    this.setBonus(this.getBonus()+bonus);
    }

    public void trocaSupervisor(Funcionario Supervior) {
    this.setSupervisor(Supervior);
    }

    public void calculaComissao(float valor, float porcentagem) {
    this.setComissao(valor/porcentagem*100);
    }
    
   
}
