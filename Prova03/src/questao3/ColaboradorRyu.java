
package questao3;


public class ColaboradorRyu extends Colaborador {
    
    private int vitalidade = 100;

    public void hadouken() {
        System.out.println("Hadouken!");
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }
    
}
