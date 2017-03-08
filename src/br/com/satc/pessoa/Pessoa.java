package br.com.satc.pessoa;

public abstract class Pessoa implements IPessoa {

    private String nome, rg, cpf, logradouro;
    private float renda;

    Pessoa(String nome, String rg, String cpf, String logradouro, Float renda) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRg(rg);
        this.setLogradouro(logradouro);
        this.setRenda(renda);

    }


    public String getNome() {
        return nome;
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