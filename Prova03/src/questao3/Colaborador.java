package questao3;


public abstract class Colaborador {
    
    private Mediador mediador;
    
    public void chamarOperacao() {
        mediador.OperacaoMediada();
    }

    public Mediador getMediador() {
        return mediador;
    }

    public void setMediador(Mediador mediador) {
        this.mediador = mediador;
    }
    
}
