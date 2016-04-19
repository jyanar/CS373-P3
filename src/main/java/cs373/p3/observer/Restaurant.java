package cs373.p3.observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private List<RestaurantObserver> observers;
	private int currentOrderSize;
	
	public Restaurant(){
		observers = new ArrayList<>();
	}
	
	public void setOrder(int orderSize){
		currentOrderSize = orderSize;
	}
	
	public void addObserver(RestaurantObserver obs){
		observers.add(obs);
	}
	
	public void removeObserver(RestaurantObserver obs){
		observers.remove(obs);
	}
	
	public void notifyObservers(){
		for(RestaurantObserver obs : observers){
			obs.update(currentOrderSize);
		}
	}
}
