package questao3;


public class ColaboradorKen extends Colaborador{
    
    private int vitalidade = 100;
    
    public void shoryuken() {
        System.out.println("Shoryuken!");
    }
    
    public void defender() {
        this.vitalidade -= 8;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }
    
}
