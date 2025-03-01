import java.util.ArrayList;

public class ContactService {
	
	private static final Object Contact = null;
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
}
	
	// Add a new contact
	public void addContact(String lastName, String firstName, String phone, String address) {
		Contact contact = new Contact(lastName, firstName, phone, address);
		contactList.add(contact);
		
	}
// delete old contact
	public void removeContact(String lastName, String firstName, String phone, String address) {
		for (int counter = 0; counter < contactList.size(); counter++) {
		contactList.remove(Contact);
		break;
}

		// update the first name 
		public void updatefirstName (String contactId, String string) {
			for( int counter = 0; counter < contactList.size(); counter++)
		}if(contactList.get(counter).getContactId().equals(contactId)) {
			int counter;
			Object updatedString;
			contactList.get(counter).setfirstName(updatedString);
			break;
		}
		if (counter == contactList.size ()-1) {
			String contactId;
			System.out.println("Contact Id: " + contactId + "not found.");
		}
		// update the last name 
		public void updatelastName (String contactId) {
			for( int counter = 0; counter < contactList.size(); counter++)
		}if(contactList.get(counter).getContactId().equals(contactId)) {
			int counter;
			Object updatedString;
			contactList.get(counter).setlastName(updatedString);
			break;
		}
		if (counter == contactList.size ()-1) {
			String contactId;
			System.out.println("Contact Id: " + contactId + "not found.");
		}
		// update the phone number 
		public void updateNumber (String contactId) {
			for( int counter = 0; counter < contactList.size(); counter++)
		}if(contactList.get(counter).getContactId().equals(contactId)) {
			int counter;
			contactList.get(counter).setNumber(updatedString);
			break;
		}
		if (counter == contactList.size ()-1) {
			String contactId;
			System.out.println("Contact Id: " + contactId + "not found.");
		}
		// update the address  
		public void updateaddress (String contactId) {
			for( int counter = 0; counter < contactList.size(); counter++)
		}if(contactList.get(counter).getContactId().equals(contactId)) {
			contactList.get(counter).setAddress(updatedString);
			break;
		}
		if (counter == contactList.size ()-1) {
			System.out.println("Contact Id: " + contactId + "not found.");
		}

		public void displayContactList() {
			// TODO Auto-generated method stub
			
		}
		public Object getContact(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		public void updatelastName(String string, String string2) {
			// TODO Auto-generated method stub
			
		}
		}
		}