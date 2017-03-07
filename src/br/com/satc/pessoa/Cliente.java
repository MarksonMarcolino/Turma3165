package br.com.satc.pessoa;


public class Cliente extends Pessoa{
    public Cliente(String nome, String rg, String cpf, String logradouro, float renda) {
        super(nome, rg, cpf, logradouro, renda);
    }

    public String retornaDados() {
    
        return "Cpf: "+this.getCpf()+" Nome: "+this.getNome()+" RG: "+this.getRg()+"Logradouro: "+this.getLogradouro()+"Renda: "+this.getRenda();
    }

    public void AlteraNome(String nome) {
    this.setNome(nome);
    }
}