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

    	System.out.println("********* OBSERVER PATTERN *********");
  		Restaurant restaurant = new Restaurant();
		restaurant.addObserver(new French_Chef());
		restaurant.addObserver(new Chinese_Chef());
		restaurant.addObserver(new Mexican_Chef());
		
		restaurant.setOrder(10);
		restaurant.notifyObservers();
		
		restaurant.setOrder(20);
		restaurant.notifyObservers();

		System.out.println("\n********* PROXY PATTERN ************");

    	// Here, we open a document, using a proxy at first -- which doesn't
    	// pull the whole document into memory. If the user requests the whole
    	// document, however, using displayFullDocument(), it will pull the whole
    	// document from memory, and this takes a little more time since it's
    	// computationally heavy. 

		Document document = new ProxyDocument("my_doc.odt");
		System.out.println(document.displayPreview());      // Utilizes the proxy document
		System.out.println(document.displayFullDocument()); // Utilizes RealDocument

    }
}