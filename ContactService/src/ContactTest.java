import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	@DisplayName("Contact ID has correct letters")
	void testContactIdTen() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", "Address");
		if (contact.getcontactId().length()> 10) {
		fail("Id has more than ten characters.");
	}

}

	@Test
	@DisplayName("Contact first name has correct letters")
	void testContactFirstNameTen() {
		Contact contact = new Contact("FirstNameFirstName", "LastName", "PhoneNumber", "Address");
		if (contact.getFirstName().length()> 10) {
		fail("First has more than ten characters.");
	}

}

	@Test
	@DisplayName("Contact Last Name has correct letters")
	void testContactLastNameTen() {
		Contact contact = new Contact("FirstName", "LastNameLastNameLast", "PhoneNumber", "Address");
		if (contact.getcontactId().length()> 10) {
		fail("Last has more than ten characters.");
	}

}

	@Test
	@DisplayName("Contact phone number has correct numbers")
	void testContactNumberTen() {
		Contact contact = new Contact("FirstName", "LastName", "55555555555", "Address");
		if (contact.getNumber().length() != 10) {
		fail("Phone number length is wrong.");
	}

}

	@Test
	@DisplayName("Contact address has correct characters")
	void testContactAddressTen() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", "Barnes and nobles is a wholesale book company 15645615484518485164615468135515315151");
		if (contact.getAddress().length()> 30) {
		fail("Address has to many characters.");
	}

}

	@Test
	@DisplayName("Contact First Name not null")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact("null", "LastName", "PhoneNumber", "Address");
		assertNotNull(contact.getFirstName(), "First name was null.");
	}
	@Test
	@DisplayName("Contact Number not null")
	void testContactPhoneNumberNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "null", "Address");
		assertNotNull(contact.getNumber(), "Number was null.");
	}
	@Test
	@DisplayName("Contact Address not null")
	void testContactAddresNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumber", "null");
		assertNotNull(contact.getAddress(), "Address was null.");
	}



}
