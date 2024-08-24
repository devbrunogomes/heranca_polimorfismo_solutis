package ClassesQuestoes5a11;

/**
 *
 * @author bsgom
 */
public class FuncionarioEnsinoMedio extends Funcionario {

    private final String nomeEscola;
    private final int RENDA_BASICA = 1650;
    
    //Construtor
    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, Cargo cargo, String nomeEscola) {
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
