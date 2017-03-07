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
public abstract class Funcionarios extends Pessoa { 
    private String setor, cargo;
    private float salario, bonus, salarioFinal; 
    private Funcionarios supervisor;  

    public Funcionarios(String nome, String rg, String cpf, String logradouro, float renda, String setor, String cargo, float salario, float bonus, float salarioFinal) {
        super(nome, rg, cpf, logradouro, renda);
        this.setBonus(bonus);
        this.setCargo(cargo);
        this.setSalario(salario);        
        this.setSetor(setor);
        
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the bonus
     */
    public float getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the salarioFinal
     */
    public float getSalarioFinal() {
        return salarioFinal;
    }

    /**
     * @param salarioFinal the salarioFinal to set
     */
    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    /**
     * @return the supervisor
     */
    public Funcionarios getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Funcionarios supervisor) {
        this.supervisor = supervisor;
    }

   
    
}
