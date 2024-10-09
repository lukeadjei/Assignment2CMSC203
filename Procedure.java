package assignment2Package;

public class Procedure {
	private String procedureName;
	private String dateOfProcedure;
	private String practionerName;
	private double charges;
	
	
	public Procedure() {
		this.procedureName = "";
		this.dateOfProcedure = "";
		this.practionerName = "";
		this.charges = 0.0;
		
	}
	public Procedure(String procedureName, String dateOfProcedure) {
		this.procedureName = procedureName;
		this.dateOfProcedure = dateOfProcedure;
	}
	public Procedure(String procedureName, String dateOfProcedure, String practionerName, double charges) {
		this.procedureName = procedureName;
		this.dateOfProcedure = dateOfProcedure;
		this.practionerName = practionerName;
		this.charges = charges;
	}
	
	//Accessors
	public String getProcedureName() {
		return this.procedureName;
	}
	public String getDateOfProcedure() {
		return this.dateOfProcedure;
	}
	public String getPractionerName() {
		return this.practionerName;
	}
	public double getCharges() {
		return this.charges;
	}
	
	//Mutators
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setDateOfProcedure(String dateOfProcedure) {
		this.dateOfProcedure = dateOfProcedure;
	}
	public void setPractionerName(String practionerName) {
		this.practionerName = practionerName;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	public String toString() {
		return "Procedure Name: " + this.getProcedureName() + "\nDate Of Procedure: " + this.getDateOfProcedure() + "\nPractioner Name: " + this.getPractionerName() + "\nCharges: " + this.getCharges(); 
	}
}
