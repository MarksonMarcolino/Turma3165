
package br.com.satc.pessoa;


public abstract class Funcionario extends Pessoa {
    private String setor, cargo;
    private Float salario,bonus,salario_final;
    private Funcionario supervisor;


   public Funcionario(String nome, String rg, String cpf, String setor, String cargo, Float bonus, Float salario) {
      super(nome, rg, cpf);
      this.setSetor(setor);
      this.setCargo(cargo);
      this.setSalario(salario);
      this.setBonus(bonus);
      
    }
    
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

    
    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    
    public Float getBonus() {
        return bonus;
    }

   
    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    
    public Float getSalario_final() {
        return salario_final;
    }

   
    public void setSalario_final(Float salario_final) {
        this.salario_final = salario_final;
    }

    
    public Funcionario getSupervisor() {
        return supervisor;
    }

    
    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }
}      
