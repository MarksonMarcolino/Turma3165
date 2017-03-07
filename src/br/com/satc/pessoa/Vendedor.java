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
public class Vendedor extends Funcionarios implements IVendedor {
    private float comissao;
    private String especialidade; 
    

    public Vendedor(String nome, String rg, String cpf, String logradouro, float renda, String setor, String cargo, float salario, float bonus, float salarioFinal, String especialidade) {
        super(nome, rg, cpf, logradouro, renda, setor, cargo, salario, bonus, salarioFinal);
        this.setEspecialidade(especialidade);
        
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
        return "Cpf: " + this.getCpf() + "nome: " + this.getNome() + "Logradouro: " + this.getLogradouro() + "rg: " + this.getRg() + "renda: " + this.getRenda() + "setor: " + this.getSetor() + "cargo:" + this.getCargo() + "salario: " + this.getSalario() + "bonus:" + this.getBonus() + "salario:" + this.getSalario() + "especialidade: " + this.getEspecialidade();
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome); 
    }

    @Override
    public void calculaComissao(float valor, float porcentagem) {
        this.setComissao(valor/porcentagem*100);
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
    
}
