package odev7kalitimClass;

import java.sql.Date;

public abstract class Report {
	
	protected String name;
	protected String result;
	protected Date createDate;
	
	public Report (String name) {
		this.name=name;
	}
	
	public Report () {
		this.name = "";
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public abstract String Print(String r);

}

