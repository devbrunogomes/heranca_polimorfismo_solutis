/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesQuestoes5a11;

/**
 *
 * @author bsgom
 */
public class FuncionarioEnsinoBasico extends Funcionario {

    private final String nomeEscola;
    private final int RENDA_BASICA = 1100;

    //Construtor
    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, Cargo cargo, String nomeEscola) {
        super(nome, codigoFuncional, cargo);
        this.nomeEscola = nomeEscola;
    }

    //Getter
    public String getNomeEscola() {
        return nomeEscola;
    }

    @Override
    public void calcularRendaTotal() {
        int novaRenda = this.RENDA_BASICA + getComissao();        
        setRendaTotal(novaRenda);
    }
    
    
}
