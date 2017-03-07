package br.com.satc.pessoa;
public class Vendedor extends Funcionario implements IVendedor{
    private float comissao;
    private String especialidade;

    public Vendedor(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.setEspecialidade(especialidade);
    }

    public String retornaDados(String vlt) {
        vlt = "Dados:\nNome: " + getNome() + "\nRG: " + getRg() + "\nCpf: " + getCpf() + "\nComissão: " + getComissao()+ "\nEspecialidade: " + getEspecialidade();
        return vlt; 
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
        
    }

    @Override
    public void addBonus(float bonus) {
        this.setSfinal((bonus + this.getSalario()));
    }

   
    public void alterarSupervisor() {
        Funcionario sv = null;
        this.setSupervisor(sv);
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
    public void alterarSupervisor(String sv) {
        this.setSupervisor(this);
    }

    @Override
    public void calculaComissao(float valor, float porcentagem) {
        float comissao = 0;
        porcentagem = (valor * comissao)/100;
    }

}
