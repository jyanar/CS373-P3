package cs373.p3.observer;

public class Main {

	public static void main(String[] args) {
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
