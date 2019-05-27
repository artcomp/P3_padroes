/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

import java.util.ArrayList;

/**
 *
 * @author art
 */
public class PerfumeSubject {
    
    private Perfume perfume;
    ArrayList<PerfumeObserver> observers;

    public PerfumeSubject() {
        observers = new ArrayList<>();
    }
          
   public void attach(PerfumeObserver observer) {
		observers.add(observer);
	}

	public void detach(int indice) {
		observers.remove(indice);
	}

	public void setState(Perfume dados) {
		this.perfume = dados;
		notifyObservers();
	}

	private void notifyObservers() {
		for (PerfumeObserver observer : observers) {
			observer.update();
		}
	}
        
	public Perfume getState() {
		return perfume;
	}

    
    
}
