package odev6document;

public class Aplication {
	

public static void main(String[] args) {
	
	PDFDocument pdfbelge = new PDFDocument("Pdf d�k�man alan� g�nderildi ..");
	WordDocument wordbelge = new WordDocument("Word d�k�man alan� g�nderildi ..");
	
	Printer.printPDFDocument(pdfbelge);
	Printer.printWordDocument(wordbelge);
	}
}
