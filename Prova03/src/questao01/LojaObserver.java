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
public class LojaObserver extends PerfumeObserver {

    public LojaObserver(PerfumeSubject perfume) {
        super(perfume);
    }

    @Override
    public void update() {
        perfume.getState().setValor_loja((float) (1.75 * perfume.getState().getPreco()));
    }


    
}
