package com.pdfmanager;

public class PdfManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	
	public static void generatePDF() {
		//Instantiate Document Object
	 	com.aspose.pdf.Document doc = new com.aspose.pdf.Document();
	 	//Instantiate document Collection object
	 	doc.setCollection(new com.aspose.pdf.Collection());
	 	 
	 	//Get Files to add to Portfolio
	 	//com.aspose.pdf.FileSpecification xps = new com.aspose.pdf.FileSpecification("printoutput.xps");
	 	com.aspose.pdf.FileSpecification word = new com.aspose.pdf.FileSpecification("sample.doc");
	 	com.aspose.pdf.FileSpecification image = new com.aspose.pdf.FileSpecification("aspose.png");
	 	com.aspose.pdf.FileSpecification pdf = new com.aspose.pdf.FileSpecification("test.PDF");
	 	 
	 	//Provide description of the files
	 	//xps.setDescription("XPS File");
	 	word.setDescription("Word File");
	 	image.setDescription("Image File");
	 	pdf.setDescription("PDF File");
	 	 
	 	//Add files to document collection
	 	//doc.getCollection().add(xps);
	 	doc.getCollection().add(word);
	 	doc.getCollection().add(image);
	 	doc.getCollection().add(pdf);
	 	System.out.println(pdf.getName());
	 	System.out.println("inside first method");
	 	//Save Portfolio document
	 	doc.save("PortFoliio_output.pdf");
	}

}
