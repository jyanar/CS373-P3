package cs373.p3.proxy;

public class Image {

	private String filename;
	private String description = "/////// This is an image of a cow. ///////";

	public Image(String filename, boolean fetchSlowly) {
		if (fetchSlowly) {
			try {
				Thread.sleep(4000);	// Represents an operation which is computationally heavy
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		} else {
			this.description = "/////// This is a preview of an image of a cow. ///////";
		}
		this.filename = filename;
	}

	public String getDescription() {
		return description;
	}
}
