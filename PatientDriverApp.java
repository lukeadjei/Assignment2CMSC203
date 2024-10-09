package assignment2Package;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi 
 * Description: (Give a brief description for each Class)
 * Due: 10/8/24
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Luke Adjei
*/



public class PatientDriverApp {

	public static void main(String[] args) {
		Patient patient1 = new Patient("John", "D.", "Doe", "123 Main St", "Anytown", "NY", "12345", "5551234567", "Jane Doe", "5557654321");
		Procedure proc1 = new Procedure("Blood Test", "10/10/2023", "Dr. Smith", 150.00);
		Procedure proc2 = new Procedure("X-Ray", "10/12/2023", "Dr. Jones", 200.00);
		Procedure proc3 = new Procedure("MRI Scan", "10/15/2023", "Dr. Lee", 1200.00);
		System.out.println("Patient info:");
		displayPatient(patient1);
		System.out.println("Procedures:");
		displayProcedure(proc1);
		displayProcedure(proc2);
		displayProcedure(proc3);
		System.out.println("Total Charges: $" + calculateTotalCharges(proc1, proc2, proc3));



	}
	
	public static void displayPatient(Patient object) {
		System.out.println(object.toString().indent(2));
	}
	public static void displayProcedure(Procedure object) {
		System.out.println(object.toString().indent(7));
	}
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return Math.round((procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges())*(100.0))/100.0;
	}
	
}
