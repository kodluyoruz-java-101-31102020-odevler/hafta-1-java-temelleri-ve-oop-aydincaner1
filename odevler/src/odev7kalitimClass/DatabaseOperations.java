package odev7kalitimClass;

public abstract class DatabaseOperations {

	 String operations="";

	public DatabaseOperations (String gelen){
		this.operations=gelen;
	}
	
	public static void open () {
		
	}
	
	public String runQuery (String q) {
		return this.operations;
	}
	
	public abstract String Report(String deger);
	
}
