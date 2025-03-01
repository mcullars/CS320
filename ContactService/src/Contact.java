
public class Contact {
// class variables
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String number;
	
	// Constructors 
	
	public Contact(String firstName, String lastName, String phone, String address) {
		// First Name constructor
		if(firstName == null || firstName.length() > 10 || firstName.isEmpty()) {
			this.firstName = "Null";
			System.out.println("Invalid first name.");{
			} else if  (firstName.length() < 10) {
				this.firstName = firstName.substring(0,10);{
				} else { 
					this.firstName = firstName;
				}
				// Last Name constructor
				if(lastName == null || lastName.length() > 10 || lastName.isEmpty()) {
					this.lastName = "Null";
					System.out.println("Invalid last name.");{
					} else if  (lastName.length() < 10) {
						this.lastName = lastName.substring(0,10);{
						} else { 
							this.lastName = lastName;
			}
			// Number constructor 
				String number;
				if (number == null || number.length() != 10 || number.isEmpty()) {
					this.number = "Null";
				} else { this.number = number;
							
				}
				
				// address constructor
				if (address == null || address.length() > 30 || address.isEmpty()) {
					this.address = "Null";
				} else {this.address = address;
			
		}
				// Getters
				public String getcontactId() {
					return contactId;
				}
				public String firstName() {
					return firstName;
				}
				public String lastName() {
					return lastName;
				}
				public String phone() {
					return phone;
				}
				public String address() {
					return address;
				}
				// Setters
				public void setfirstName(Object updatedString) {
					this.firstName = (String) updatedString;
				}
				public void setlastName(Object updatedString) {
					this.lastName = (String) updatedString;
				}
				public void setphone(String phone) {
					this.phone = phone;
				}
				public void address(String address) {
					this.address = address;
				}
				}
				}
	}
}
