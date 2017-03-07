package br.com.satc.pessoa;
public abstract class Funcionario extends Pessoa implements IFuncionario{

    private String setor, cargo;
    float salario, bonus, sfinal;
    private Funcionario supervisor;
    

    public Funcionario(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
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
     * @return the sfinal
     */
    public float getSfinal() {
        return sfinal;
    }

    /**
     * @param sfinal the sfinal to set
     */
    public void setSfinal(float sfinal) {
        this.sfinal = sfinal;
    }

    /**
     * @return the surpevisor
     */
    public Funcionario getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the surpevisor to set
     */
    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }
    
    
}
