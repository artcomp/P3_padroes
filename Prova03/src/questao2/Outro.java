package questao2;


public class Outro extends Passo{
    
    private String acao;

    public Outro(float quantidade, String unidade, String ingrediente, String acao) {
        super(quantidade, unidade, ingrediente);
        this.acao= acao;
    }
    
    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
    
}
