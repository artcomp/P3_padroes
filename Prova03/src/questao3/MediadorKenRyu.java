package questao3;


public class MediadorKenRyu implements Mediador{

    private ColaboradorRyu ryu;
    private ColaboradorKen ken;

    public MediadorKenRyu(ColaboradorRyu ryu, ColaboradorKen ken) {
        this.ryu = ryu;
        this.ken = ken;
        this.ryu.setMediador(this);
        this.ken.setMediador(this);
    }

    public ColaboradorRyu getRyu() {
        return ryu;
    }

    public void setRyu(ColaboradorRyu ryu) {
        this.ryu = ryu;
    }

    public ColaboradorKen getKen() {
        return ken;
    }

    public void setKen(ColaboradorKen ken) {
        this.ken = ken;
    }
    
    @Override
    public void OperacaoMediada() {   
        if (ryu != null)
            ryu.hadouken();
        if (ken != null)
            ken.defender();
    }
    
}
