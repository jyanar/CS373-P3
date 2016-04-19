package cs373.p3;

import cs373.p3.observer.Chinese_Chef;
import cs373.p3.observer.French_Chef;
import cs373.p3.observer.Mexican_Chef;
import cs373.p3.observer.Restaurant;

import cs373.p3.proxy.Document;
import cs373.p3.proxy.Figure;
import cs373.p3.proxy.Image;
import cs373.p3.proxy.ProxyDocument;
import cs373.p3.proxy.RealDocument;
import cs373.p3.proxy.Text;

public class Main {
    public static void main(String[] args) {

  		// Restaurant restaurant = new Restaurant();
		// restaurant.addObserver(new French_Chef());
		// restaurant.addObserver(new Chinese_Chef());
		// restaurant.addObserver(new Mexican_Chef());
		
		// restaurant.setOrder(10);
		// restaurant.notifyObservers();
		
		// restaurant.setOrder(20);
		// restaurant.notifyObservers();

		Document document = new ProxyDocument("my_dank_doc.odt");
		document.fetchDocument();
		document.displayFullDocument();



    }
}