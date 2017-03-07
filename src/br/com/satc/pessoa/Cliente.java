
package br.com.satc.pessoa;

/**
 *
 * @author Markson
 */
public class Cliente extends Pessoa {
    float renda;
    String logradouro;
    

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public Cliente(float renda, String logradouro, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.renda = renda;
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    

    public Cliente(String nome, String rg, String cpf, float renda, String logradouro) {
        super(nome, rg, cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
    }

    @Override
    public String retornaDados() {       
    return "cpf: " + this.getCpf() + "nome: " + this.getNome()+ "logradouro: " + this.getLogradouro() + "renda: " + this.getRenda() + "rg: " + this.getRg();}

    @Override
    public void AlteraNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
