package questao2;


public abstract class Passo {
    
    protected float quantidade;
    protected String unidade;
    protected String ingrediente;
    protected Passo emSeguida;

    public Passo(float quantidade, String unidade, String ingrediente) {
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.ingrediente = ingrediente;
        this.emSeguida = null;
 
    }
   
    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    public int quantosPassos()  {
        if (emSeguida!=null){
            return 1 + emSeguida.quantosPassos(); 
        }else{
            return 1;
        }
    }
    public Passo setEmSeguida(Passo passo) {
         if (emSeguida == null) {
            emSeguida = passo;
        } else {
            emSeguida.setEmSeguida(passo);
        }
        return emSeguida;
    }
    public Passo getEmSeguida(){
        return emSeguida;
    }
  
}
