package questao2;


public class Cozinhar extends Passo {
    
    private String utensilio;

    public Cozinhar(float quantidade, String unidade, String ingrediente, String utensilio ) {
        super(quantidade, unidade, ingrediente);
        this.utensilio = utensilio;
    }

    public String getUtensilio() {
        return utensilio;
    }

    public void setUtensilio(String utensilio) {
        this.utensilio = utensilio;
    }
     
}
