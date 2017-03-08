
package br.com.satc.pessoa;


public class Vendedor extends Funcionario implements IVendedor {
   private Float comissao;
   private String especialidade;
   
   
    public Vendedor(String nome, String rg, String cpf, String setor, String cargo, Float bonus, Float salario) {
        super(nome, rg, cpf, setor, cargo, bonus, salario);
        this.setEspecialidade(especialidade);
    }
    
    public String retornaDados(String getBonus, String getCargo, String getSetor) {
      
        String c = "Nome do funcionário: "+getNome()+", RG do funcionário: "+getRg()+", CPF do funcionário: "+getCpf()+", Setor do funcionário: "+getSetor+", Cargo do funcionário: "+getCargo+", Bonus do funcionário: "+getBonus+" e Salário do funcionário: R$"+getSalario()+".";
        return c;
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }

    
    public Float getComissao() {
        return comissao;
    }

    
    public void setComissao(Float comissao) {
        this.comissao = comissao;
    }

    
    public String getEspecialidade() {
        return especialidade;
    }

    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void calculaComisssao(Float valor, Float porcentagem) {
       Float a = (valor/100) * porcentagem;
       this.setComissao(a);
    }

    @Override
    public String retornaDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
