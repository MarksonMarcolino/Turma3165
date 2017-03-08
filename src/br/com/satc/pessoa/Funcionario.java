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
    private String Setor;
    private String Cargo;
    private Float Salario;
 public Funcionario(String nome, String rg, String cpf, String logradouro, Float renda, String setor,String cargo,Float Salario,Float bonus) {
        super(nome, rg, cpf, logradouro, renda);
        this.setSetor(setor);
        this.setCargo(Cargo);
        this.setSalario(Salario);
        this.setBonus(bonus);
    }
  
    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public Float getSalario() {
        return Salario;
    }

    public void setSalario(Float Salario) {
        this.Salario = Salario;
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public Float getSalario_final() {
        return Salario_final;
    }

    public void setSalario_final(Float Salario_final) {
        this.Salario_final = Salario_final;
    }

    public Funcionario getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(Funcionario Supervisor) {
        this.Supervisor = Supervisor;
    }
    private Float bonus;
    private Float Salario_final;
    private Funcionario Supervisor;        



}
