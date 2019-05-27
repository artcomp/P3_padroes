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
public class MatrizObserver extends PerfumeObserver{

    public MatrizObserver(PerfumeSubject perfume) {
        super(perfume);
    }

    @Override
    public void update() {
        perfume.getState().setValor_matriz((float) (1.5 * perfume.getState().getPreco()));
    }
    
}
