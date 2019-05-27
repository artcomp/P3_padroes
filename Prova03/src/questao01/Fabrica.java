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
public class Fabrica {

    private int CGC;
    private String endereco;
    private int numero_de_operarios;
    
    private static Fabrica instance;

    public Fabrica() {
        this.CGC = 123123123;
    }
    
    static Fabrica getinstance(){
        return instance == null ? new Fabrica() : instance;
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

    public int getNumero_de_operarios() {
        return numero_de_operarios;
    }

    public void setNumero_de_operarios(int numero_de_operarios) {
        this.numero_de_operarios = numero_de_operarios;
    }
    
    
    public Perfume fazerPerfume(String nome,float preco,String linha){
        return new Perfume(nome, preco, linha);
    }
    
    public float venderPerfume(Perfume p){
        return p.getValor_fabrica();
    }
}
