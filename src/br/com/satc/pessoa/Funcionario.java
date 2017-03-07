package br.com.satc.pessoa;

public abstract class Funcionario extends Pessoa implements IFuncionario{
    
    private String setor, cargo;
    public float salario, bonus,salariofinal;
    private Funcionario supervisor;
    
    public Funcionario(String nome, String rg, String cpf) {
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

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }
    
}
