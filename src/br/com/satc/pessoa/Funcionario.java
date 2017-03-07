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
    
   private String setor;
   private String cargo;
   private float salario;
   private float bonus;
   private float salariofinal;
   private Funcionario supervisor;
    
    public Funcionario(String nome, String rg, String cpf,String setor,String cargo,float salario,float bunus ) {
        super(nome, rg, cpf);
        
        this.setSetor(setor);
        this.setCargo(cargo);
        this.setSalario(salario);
        this.setBonus(bonus);
        
        
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
     * @return the bunus
     */
    public float getBonus() {
        return bonus;
    }

    /**
     * @param bunus the bunus to set
     */
    public void setBonus(float bunus) {
        this.bonus = bonus;
    }

    /**
     * @return the salariofinal
     */
    public float getSalariofinal() {
        return salariofinal;
    }

    /**
     * @param salariofinal the salariofinal to set
     */
    public void setSalariofinal(float salariofinal) {
        this.salariofinal = salariofinal;
    }

    /**
     * @return the supervisor
     */
    public Funcionario getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }
    
}
