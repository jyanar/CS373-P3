package cs373.p3.observer;

public class French_Chef implements RestaurantObserver{
	public void update(int orderSize){
		System.out.println("French Chef makes " + orderSize + " Escargot.");
	}
}
