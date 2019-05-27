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
public abstract class PerfumeObserver {
    
    
    protected PerfumeSubject perfume;

    public PerfumeObserver(PerfumeSubject perfume) {
        this.perfume = perfume;
    }

    
    public abstract void update();
    
}
