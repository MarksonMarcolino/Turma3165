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
public class Vendedor extends Funcionario implements IVendedor {
private float Comissao;
private String especialidade;

    public Vendedor(String nome, String rg, String cpf, String logradouro, Float renda, String setor, String cargo, Float Salario, Float bonus) {
        super(nome, rg, cpf, logradouro, renda, setor, cargo, Salario, bonus);
         this.setEspecialidade(especialidade);
    }

    public float getComissao() {
        return Comissao;
    }

    public void setComissao(float Comissao) {
        this.Comissao = Comissao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String retornaDados() {
    return "Cpf: " + this.getCpf() + " Nome:" + this.getNome() + " rg: " + this.getRg() + " logradouro: " + this.getLogradouro() + "renda: " + this.getRenda() + "Setor:" + this.getSetor() + "Cargo:" + this.getCargo() + "Salario:" + this.getSalario() + "Bonus:" + this.getBonus() + "Especialidade:" + this.getEspecialidade();

    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }

    @Override
    public void adicionaBonus(Float bonus) {
        this.setBonus(this.getBonus() + bonus);
    }

    @Override
    public void trocaSupervisor(Funcionario supervisor) {
        this.setSupervisor(supervisor);
    }

    @Override
    public void calculaComissao(Float valor, Float porcentagem) {
        this.setComissao(valor/porcentagem*100);
    }

    
}
