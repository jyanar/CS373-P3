package cs373.p3;

import cs373.p3.observer.Chinese_Chef;
import cs373.p3.observer.French_Chef;
import cs373.p3.observer.Mexican_Chef;
import cs373.p3.observer.Restaurant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        Restaurant restaurant = new Restaurant();
		restaurant.addObserver(new French_Chef());
		restaurant.addObserver(new Chinese_Chef());
		restaurant.addObserver(new Mexican_Chef());
		
		restaurant.setOrder(10);
		restaurant.notifyObservers();
		
		restaurant.setOrder(20);
		restaurant.notifyObservers();
    }
}