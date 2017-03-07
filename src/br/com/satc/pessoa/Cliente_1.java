package br.com.satc.pessoa;

public class Cliente extends Pessoa {

    public Cliente(String nome, String rg, String cpf, String logradouro, double renda) {
        super(nome, rg, cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
    }
    private String logradouro;
    private double renda;
    
    @Override
    public String retornaDados() {
        String volta;
        volta="Dados: "+getNome()+ ", "+getRg()+ ", "+getCpf()+ ", "+getLogradouro()+ ", "+getRenda();
        return volta;
    }

    @Override
    public void AlteraNome(String i) {
        this.setNome(i);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
