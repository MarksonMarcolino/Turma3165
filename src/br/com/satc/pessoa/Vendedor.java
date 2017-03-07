
package br.com.satc.pessoa;

/**
 *
 * @author Edutec
 */
public class Vendedor {
       private String especialidade;

    public Vendedor(String nome, String rg, String cpf, String cargo, String setor, float comissao, float salario,String especialidade,Funcionario supervisor) {
        super(nome, rg, cpf, cargo, setor, comissao, salario);
        this.especialidade = especialidade;
        
    }

    
}
