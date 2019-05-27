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
public class Loja {

    private int CGC;
    private String endereco;
    private int numero_de_vendedores;
    
    private static Loja instance;

    public Loja() {
        this.CGC = 123123123;
    }
    
    static Loja getinstance(){
        return instance == null ? new Loja() : instance;
    }

    public Loja(int CGC, String endereco, int numero_de_vendedores) {
        this.CGC = CGC;
        this.endereco = endereco;
        this.numero_de_vendedores = numero_de_vendedores;
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

    public int getNumero_de_vendedores() {
        return numero_de_vendedores;
    }

    public void setNumero_de_vendedores(int numero_de_vendedores) {
        this.numero_de_vendedores = numero_de_vendedores;
    }

      public float venderPerfume(Perfume p){
        return p.getValor_loja();
    }
    
    
}
