package cs373.p3.proxy;

public class ProxyDocument implements Document {

	private String filename;
	private RealDocument realDocument = null; 
	private Image documentImage = null;
	private Figure documentFigure = null;
	private Text documentText = null;

	public ProxyDocument(String filename) {
		this.filename = filename;
	}

	public String displayFullDocument() {
		realDocument = new RealDocument(filename);
		return realDocument.displayFullDocument();
	}

	public void fetchDocument() {
		System.out.println("Fetching the document in fast mode.");
		this.documentImage = fetchImage(filename);
		this.documentFigure = fetchFigure(filename);
		this.documentText = fetchText(filename);
	}

	private Image fetchImage(String filename) {
		return new Image(filename, false);
	}

	private Figure fetchFigure(String filename) {
		return new Figure(filename, false);
	}

	private Text fetchText(String filename) {
		return new Text(filename, false);
	}
}



/**
  * Instead of fetching the full document given by the specified filename,
  * proxy document fetches small previews of the document which the user is
  * currently mousing over. This is similar to the preview feature in OS X,
  * where one can press space while in the viewfinder in order to be 
  * presented with a preview of the document before opening it. 
  */