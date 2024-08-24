package ClassesQuestoes5a11;

public class Funcionario {

    private String nome;
    private int codigoFuncional;
    private int RENDA_BASICA = 1000; //Valor inicial, só é acrescido se possuir mais qualificacao (Em outras classes)
    private Cargo cargo;
    private int comissao;
    private int rendaTotal = 0;

    public Funcionario(String nome, int codigoFuncional, Cargo cargo) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.cargo = cargo;
        atribuirComissao(cargo);        
        calcularRendaTotal();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public int getRENDA_BASICA() {
        return RENDA_BASICA;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
        atribuirComissao(cargo);
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public int getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(int rendaTotal) {
        this.rendaTotal = rendaTotal;
    }

    //Metodos
    public void atribuirComissao(Cargo cargo) {
        //Cada vez que instanciar um objeto e passar o cargo, ou quando mudar o cargo, a comissao vai ser atribuida
        switch (cargo) {
            case GERENTE:
                setComissao(1500);
                break;
            case SUPERVISOR:
                setComissao(600);
                break;
            case VENDEDOR:
                setComissao(250);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void calcularRendaTotal() {        
        int novaRenda = this.RENDA_BASICA + getComissao();        
        setRendaTotal(novaRenda);
    }

    @Override
    public String toString() {
        return "Funcionario{"
                + "nome = " + nome
                + ", comissao = " + comissao
                + ", rendaTotal = " + getRendaTotal()
                + '}';
    }

}
