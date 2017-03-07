package br.com.satc.pessoa;

public class Vendedor extends Funcionario implements IVendedeor{
    private String especialidade;
    private float comissão;
    public Vendedor(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.setEspecialidade(especialidade);
    }

    @Override
    public String retornaDados() {
       String volta;
       volta="Dados: "+getNome()+ ", "+getRg()+ ", "+getCpf()+ ", "+getEspecialidade();
       return volta;
    }
         
    @Override
    public void AlteraNome(String i) {
        this.setNome(i);
    }
    @Override
    public void adicionaBonus(float bonus) {
        this.getSalariofinal((this.getSalario()+bonus));
    }

    @Override
    public void trocaSupervisor(String i) {
        Funcionario supervisor=null;
        this.setSupervisor(supervisor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getComissão() {
        return comissão;
    }

    public void setComissão(float comissão) {
        this.comissão = comissão;
    }

    @Override
    public void calculaComissão(float valor, float porcentagem) {
        float comissão=0;
        porcentagem=(valor * porcentagem)/100;        
    }

    private void setSalariofinal(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getSalariofinal(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}