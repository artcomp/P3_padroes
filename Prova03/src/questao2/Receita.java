package questao2;


public class Receita {
    
    private String Nome;
    private Passo primeiroPasso;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Passo setPrimeiroPasso(Passo passo) {
        if (primeiroPasso == null) {
            primeiroPasso = passo;
        } else {
            primeiroPasso.setEmSeguida(passo);
        }
        return primeiroPasso;
    }

    public Passo getPrimeiroPasso() {
        return primeiroPasso;
    }
   
}
