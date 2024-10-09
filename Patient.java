package assignment2Package;

public class Patient {

		private String firstName;
		private String middleName;
		private String lastName;
		private String streetAddress;
		private String city;
		private String state;
		private String zipcode;
		private String phoneNumber;
		private String emergencyContactName;
		private String emergencyContactPhone;
		
		
		public Patient() {
			this.firstName = "";
			this.middleName = "";
			this.lastName = "";
			this.streetAddress = "";
			this.city = "";
			this.state = "";
			this.zipcode = "";
			this.phoneNumber = "";
			this.emergencyContactName = "";
			this.emergencyContactPhone = "";
		}
		
		
		public Patient(String firstName, String middleName, String lastName) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
		}
		
		public Patient(String firstName, String middleName, String lastName, 
				String streetAddress, String city, String state, String zipcode, 
				String phoneNumber, String emergencyContactName, String emergencyContactPhone){
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.streetAddress = streetAddress;
			this.city = city;
			this.state = state;
			this.zipcode = zipcode;
			this.phoneNumber = phoneNumber;
			this.emergencyContactName = emergencyContactName;
			this.emergencyContactPhone = emergencyContactPhone;
		}
		
		//Accessors
		public String getFirstName() {
			return this.firstName;
		}
		public String getMiddleName() {
			return this.middleName;
		}
		public String getLastName () {
			return this.lastName;
		}
		public String getStreetAddress() {
			return this.streetAddress;		
		}
		public String getCity() {
			return this.city;
		}
		public String getState() {
			return this.state;
		}
		public String getZipcode() {
			return this.zipcode;
		}
		public String getPhoneNumber() {
			return this.phoneNumber;
		}
		public String getEmergencyContactName() {
			return this.emergencyContactName;
		}
		public String getEmergencyContactPhoneNumber() {
			return this.emergencyContactPhone;
		}
			
			
		//mutators
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public void setLastName (String lastName) {
			this.lastName = lastName;
		}
		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;	
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		//Returns Address Line
		public String buildAddress() {
			return this.streetAddress + " " + this.city + " " + this.state + " " + this.zipcode;
		}
		
		//returns Emergency Contact Line
		public String buildEmergencyContact() {
			return this.emergencyContactName + " " + this.emergencyContactPhone;
		}
		
		//private String formatNumber(String phoneNumber) {
		//	return phoneNumber.substring(0,3) + "-" + phoneNumber.substring(3,6) + "-" + phoneNumber.substring(6);
			
		//}
		
		
		//returns all info;
		public String toString() {
			return "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + 
					"\n" + "Address: " + this.buildAddress() + "\n" + "Number: " + this.phoneNumber + "\n" + 
					"Emergency Contact: " + this.getEmergencyContactName() + ", " + this.getEmergencyContactPhoneNumber();
					
		}
		
}
		
		
		
		

