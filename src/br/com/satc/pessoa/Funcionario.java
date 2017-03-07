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
public abstract class Funcionario extends Pessoa implements IFuncionario {
    private String setor,cargo;
    private float salario,bonus,salariofinal;
    private Funcionario supervisor;
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(float salariofinal) {
        this.salariofinal = salariofinal;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }
    
    public Funcionario(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.setBonus(bonus);
        this.setCargo(cargo);
        this.setSalario(salario);
        this.setSetor(setor);
    }
    
}
