package cs373.p3.proxy;

public class Text {

	private String filename;
	private String description = "///// This is Hamlet, by Shakespeare. ////";

	public Text(String filename, boolean fetchSlowly) {
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