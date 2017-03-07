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

    private Float comissao;
    private String especialidade;

    public Float getComissao() {
        return comissao;
    }

    public void setComissao(Float comissao) {
        this.comissao = comissao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Vendedor(String nome, String rg, String cpf, String setor, String cargo, Float salario, Float bonus, String especialidade) {
        super(nome, rg, cpf, setor, cargo, salario, bonus);
        this.setEspecialidade(especialidade);
    }

    @Override
    public String retornaDados() {
        String a = "O nome do funcionário: " + getNome() + ", o CPF do funcionário: " + getCpf() + ", o RG do funcionário" + getRg() + ", o setor do funcionário: " + getSetor() + ", o cargo do funcionário: " + getCargo() + ", o salário do funcionário: R$" + getSalario() + ", o bonûs do funcionário: R$" + getBonus() + " e sua especialidade é: " + getEspecialidade() + ".";
        return a;
    }

    @Override
    public void AlteraNome(String nome) {
        setNome(nome);
    }

    @Override
    public void adicionaBonus(Float bonus) {
        setBonus(getBonus()+bonus);
    }

    @Override
    public void trocaSupervisor(Funcionario supervisor) {
        setSupervisor(supervisor);
    }

    @Override
    public void calculaComissao(Float valor, Float porcentagem) {
        Float a = (valor / 100) * porcentagem;
        setComissao(a);
    }

}
