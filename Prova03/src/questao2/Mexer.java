package questao2;


public class Mexer extends Passo{
    
    private int minutos;

    public Mexer(float quantidade, String unidade, String ingrediente, int minutos) {
        super(quantidade, unidade, ingrediente);
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
 
}
