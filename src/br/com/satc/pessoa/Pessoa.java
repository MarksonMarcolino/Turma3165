package br.com.satc.pessoa;


public class Pessoa {

    private String nome, rg, cpf, logradouro;
    private float renda;

    Pessoa(String Nome, String RG, String CPF, String logradouro, Float Renda) {
     
        this.setNome(nome);
        this.setCpf(CPF);
        this.setRg(RG);
        this.setLogradouro(logradouro);
        this.setRenda(renda);

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
}

