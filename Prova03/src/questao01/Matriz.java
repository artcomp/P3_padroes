/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

/**
 *
 * @author art
 */
public class Matriz {


    private int CGC;
    private String endereco;
    private String quimico_responsavel;
    
    private static Matriz instance;
    
    private Matriz() {  
        this.CGC = 123123123;
    }
    
    static Matriz getinstance(){
        return instance == null ? new Matriz() : instance;
    }

    public int getCGC() {
        return CGC;
    }

    public void setCGC(int CGC) {
        this.CGC = CGC;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getQuimico_responsavel() {
        return quimico_responsavel;
    }

    public void setQuimico_responsavel(String quimico_responsavel) {
        this.quimico_responsavel = quimico_responsavel;
    }

    
      public float venderPerfume(Perfume p){
        return p.getValor_matriz();
    }
}
