/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Vinícius
 */
public class Vendedor extends Funcionario {
    
    private String especialidade;

    public Vendedor(String nome, String rg, String cpf, String cargo, String setor, float comissao, float salario,String especialidade,Funcionario supervisor) {
        super(nome, rg, cpf, cargo, setor, comissao, salario);
        this.especialidade = especialidade;
        
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String retornaDados() {
        String dados = "Nome: "+this.getNome()+
                       "\nRG: "+this.getRg()+
                       "\nCPF: "+this.getCpf()+
                       "\nCargo: "+this.getCargo()+
                       "\nSetor: "+this.getSetor()+
                       "\nComissao: "+this.getComissao()+
                       "\nSalario: "+this.getSalario()+
                       "\nSalariof: "+this.getSalariof();
        return dados;                       
    }

    @Override
    public void AlteraNome(String novoNome) {
        this.setNome(novoNome);
    }

    

    @Override
    public void AdicionarBonus(float bonus) {
        this.setSalariof(this.salariof + bonus);
    }

    @Override
    public void Supervisor() {
        this.setSupervisor(supervisor);
    }

    @Override
    public float CalcularComissao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AdicionarBonus() {
       
    }

    
}
