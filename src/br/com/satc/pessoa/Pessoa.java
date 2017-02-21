package br.com.satc.pessoa;

/**
 *
 * @author Soratto
 */
public abstract class Pessoa implements IPessoa {
    private String nome, rg, cpf;
    
    Pessoa(String nome, String rg, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
