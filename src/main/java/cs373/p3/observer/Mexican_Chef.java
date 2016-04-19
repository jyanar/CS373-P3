package cs373.p3.observer;

public class Mexican_Chef implements RestaurantObserver{
	public void update(int orderSize){
		System.out.println("Mexican_Chef makes " + orderSize + " tacos.");
	}
}
