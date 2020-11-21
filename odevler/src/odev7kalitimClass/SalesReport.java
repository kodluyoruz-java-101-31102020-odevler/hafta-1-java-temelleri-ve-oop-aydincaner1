package odev7kalitimClass;

public class SalesReport extends Report {
	
	protected String[] authorizedDepartmends;

	public SalesReport(String name,String[] authorizedDepartmends) {
		super(name);
		this.authorizedDepartmends=authorizedDepartmends;
		// TODO Auto-generated constructor stub
	}

	public String[] getDepartmants() {
		return this.authorizedDepartmends;
	}

	@Override
	public String Print(String r) {
		// TODO Auto-generated method stub
		return null;
	}
}
