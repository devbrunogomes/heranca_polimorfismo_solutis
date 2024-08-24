/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes5a11;

/**
 *
 * @author bsgom
 */
public class FuncionarioGraduacao extends Funcionario {
    private final String nomeUniversidade;
    private final int RENDA_BASICA = 3300;
    
    //Construtor

    public FuncionarioGraduacao(String nome, int codigoFuncional, Cargo cargo, String nomeUniversidade) {
        super(nome, codigoFuncional, cargo);
        this.nomeUniversidade = nomeUniversidade;
    }
    

    //Getter
    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    @Override
    public void calcularRendaTotal() {
        int novaRenda = this.RENDA_BASICA + getComissao();        
        setRendaTotal(novaRenda);
    }
    
    
    
    
}
