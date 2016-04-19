package cs373.p3.proxy;

public class Image {

	private String filename;
	private String description = "/////// This is an image of a cow. ///////";

	public Image(String filename, boolean fetchSlowly) {
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
