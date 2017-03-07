
package br.com.satc.pessoa;


public class Cliente extends Pessoa {

   private float Renda;
   private String Logradouro;
   
    public Cliente(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.setRenda(Renda);
        this.setLogradouro(Logradouro);
    }

    @Override
    public String retornaDados() {
        String a = "Nome do cliente: "+getNome()+", RG do cliente: "+getRg()+", CPF do cliente: "+getCpf()+", Logradouro do cliente: " +getLogradouro()+", Renda do cliente: R$"+getRenda()+".";
        return a;
    }

    @Override
    public void AlteraNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public float getRenda() {
        return Renda;
    }

    
    public void setRenda(float Renda) {
        this.Renda = Renda;
    }

    
    public String getLogradouro() {
        return Logradouro;
    }

    
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }
    
}
