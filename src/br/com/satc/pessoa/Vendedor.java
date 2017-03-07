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

    public Vendedor(String nome, String rg, String cpf, String setor,
            String cargo, float salario, float bunus,String especialidade) {
        super(nome, rg, cpf, setor, cargo, salario, bunus);
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
        return "nome:"+getNome()+" rg:"+getRg()+"setor"+getSetor()+"cargo"+getCargo()+"salario"+getSalario()+
                "bunus"+getBunus()+"especialidade"+getEspecialidade();
    }

    @Override
    public void AlteraNome(String nome) {
        setNome(nome);
    }

    @Override
    public void adicionaBunus(float bonus) {
        setBunus(getBunus()+bonus);
        
    }

    @Override
    public void TrocaSupervisor(Funcionario TrocaSupervisor) {
        setSupervisor(TrocaSupervisor);
    }

    @Override
    public void calculaComissao(float valor, float porcentagem) {
        setComissao((valor/100)*porcentagem);
    }
    
    
    
    
}
