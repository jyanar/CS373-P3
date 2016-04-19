package cs373.p3.observer;

public class Chinese_Chef implements RestaurantObserver{
	public void update(int orderSize){
		System.out.println("Chinese Chef makes " + orderSize + " Wantons.");
	}
}
