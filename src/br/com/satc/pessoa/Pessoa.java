
package br.com.satc.pessoa;

/**
 *
 * @author Markson
 */
public abstract class Pessoa implements IPessoa {
    private String nome, rg, cpf, logradouro;
    private float renda;

    public Pessoa(String nome, String rg, String cpf, String logradouro, float renda, String string) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
        this.setRg(rg);
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }
   
    
    Pessoa(String nome, String rg, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
    }
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }


    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private void getRenda(float renda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
