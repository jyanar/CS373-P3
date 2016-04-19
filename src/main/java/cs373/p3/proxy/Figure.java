package cs373.p3.proxy;

public class Figure {

	private String filename;
	private String description = "////// This is a bar plot of sales. //////";

	public Figure(String filename, boolean fetchSlowly) {
		if (fetchSlowly) {
			try {
				Thread.sleep(4000);	// Represents an operation which is computationally heavy
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		} else {
			this.description = "////// This is a preview of a bar plot of sales. //////";
		}
		this.filename = filename;
	}

	public String getDescription() {
		return description;
	}
}
