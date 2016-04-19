package cs373.p3.proxy;

public class RealDocument implements Document {

	private String filename;
	private Image documentImage = null;
	private Figure documentFigure = null;
	private Text documentText = null;

	public RealDocument(String filename) {
		this.filename = filename;
	}

	public String displayPreview() {
		if (documentImage == null || documentText == null || documentText == null) {
			fetchDocument();
		}
		return new String(
			"************************* DOCUMENT PREVIEW *****************\n" +
			documentImage.getDescription() +  "\n" +
			documentFigure.getDescription() + "\n" +
			documentText.getDescription() +   "\n" +
			"************************************************************"
		);
	}

	public String displayFullDocument() {
		if (documentImage == null || documentText == null || documentText == null) {
			fetchDocument();
		}
		return new String(
			"************************* DOCUMENT *************************\n" +
			documentImage.getDescription() +  "\n" +
			documentFigure.getDescription() + "\n" +
			documentText.getDescription() +   "\n" +
			"************************************************************"
		);
	}

	private void fetchDocument() {
		System.out.println("Fetching the document. Please wait.");
		this.documentImage = fetchImage(filename);
		this.documentFigure = fetchFigure(filename);
		this.documentText = fetchText(filename);
	}

	private Image fetchImage(String filename) {
		return new Image(filename, true);
	}

	private Figure fetchFigure(String filename) {
		return new Figure(filename, true);
	}

	private Text fetchText(String filename) {
		return new Text(filename, true);
	}
}