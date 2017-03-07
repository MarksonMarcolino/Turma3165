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
public abstract class Funcionario extends Pessoa implements IFuncionario{
    private String Setor,Cargo;
    private float Salario,Bonus,SalarioFinal;
    private Funcionario Supervisor;        
    public Funcionario(String nome, String rg, String cpf, String logradouro, float renda, String Setor, String Cargo, float Salario, float bonus) {
        super(nome, rg, cpf, logradouro, renda);
        this.setBonus(Bonus);
        this.setCargo(Cargo);
        this.setSalario(Salario);
        this.setSetor(Setor);   
    
    }

    /**
     * @return the Setor
     */
    public String getSetor() {
        return Setor;
    }

    /**
     * @param Setor the Setor to set
     */
    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    /**
     * @return the Salario
     */
    public float getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the Bonus
     */
    public float getBonus() {
        return Bonus;
    }

    /**
     * @param Bonus the Bonus to set
     */
    public void setBonus(float Bonus) {
        this.Bonus = Bonus;
    }

    /**
     * @return the SalarioFinal
     */
    public float getSalarioFinal() {
        return SalarioFinal;
    }

    /**
     * @param SalarioFinal the SalarioFinal to set
     */
    public void setSalarioFinal(float SalarioFinal) {
        this.SalarioFinal = SalarioFinal;
    }

    /**
     * @return the Supervisor
     */
    public Funcionario getSupervisor() {
        return Supervisor;
    }

    /**
     * @param Supervisor the Supervisor to set
     */
    public void setSupervisor(Funcionario Supervisor) {
        this.Supervisor = Supervisor;
    }



}
