package cs373.p3.proxy;

public class Figure {

	private String filename;
	private String description = "////// This is a bar plot of sales. //////";

	public Figure(String filename, boolean fetchSlowly) {
		if (fetchSlowly) {
			try {
				Thread.sleep(4000);
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		this.filename = filename;
	}

	public String getDescription() {
		return description;
	}
}
