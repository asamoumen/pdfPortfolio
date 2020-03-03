package com.abdel;
import com.aspose.pdf.Document;
import com.aspose.pdf.FileSpecification;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;


public class PdfManager {
	

	public  PdfManager() {
		// TODO Auto-generated method stub
		 
	}
	
	public static String generatePDF() throws IOException {
		//Instantiate Document Object
	 	Document doc = new com.aspose.pdf.Document();
	 	//Instantiate document Collection object
	 	doc.setCollection(new com.aspose.pdf.Collection());
	 	 
	 	//Get Files to add to Portfolio
	 	//com.aspose.pdf.FileSpecification xps = new com.aspose.pdf.FileSpecification("printoutput.xps");
	 	FileSpecification word = new com.aspose.pdf.FileSpecification("sample.doc");
	 	FileSpecification image = new com.aspose.pdf.FileSpecification("aspose.png");
	 	FileSpecification pdf = new com.aspose.pdf.FileSpecification("test.PDF");
	 	 
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
	 	
	 	return encode("PortFoliio_output.pdf");
	}
	
	public static String encode(String filePath) throws IOException {
		 	 
		    File pdfFile = new File(filePath);
		    byte[] encoded = Files.readAllBytes(Paths.get(pdfFile.getAbsolutePath()));
		    Base64.Encoder enc = Base64.getEncoder();
		    byte[] strenc = enc.encode(encoded);
		    String encode = new String(strenc, "UTF-8");
		    
		    return encode;
	}

}
