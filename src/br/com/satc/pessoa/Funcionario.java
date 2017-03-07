
package br.com.satc.pessoa;

/**
 *
 * @author Edutec
 */
public abstract class Funcionario extends Pessoa implements IFuncionario{
    String setor;
    String cargo;
    float salario;
    float bonus;
    float salariofinal;
    private Funcionario supervisor;

    public Funcionario(float bonus, float renda,String nome, String rg, String cpf, String logradouro, String string, float salario, String cargo )
    {
        super(nome, rg, cpf, logradouro, renda, string);
        this.setBonus(bonus);
        this.setCargo(cargo);
        this.setCpf(cpf);
        this.setLogradouro(logradouro);
        this.setNome(nome);
        this.setRenda(renda);
        this.setRg(rg);
        this.setSalario(salario);
        this.setSetor(setor);
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
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

    public float getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(float salariofinal) {
        this.salariofinal = salariofinal;
    }
    
    
    
}
