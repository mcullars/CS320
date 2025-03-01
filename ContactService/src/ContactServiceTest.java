import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@BeforeAll
	@DisplayName("Test for first name.")
	static void testupdateFirstName1() throws Exception {
		ContactService service = new ContactService();
		service.addContact("PHD. ", "Buddy", "555-555-5555", "310 Forest Lane");
		service.updatefirstName("Lee", "8");
		service.displayContactList();
		assertEquals("Lee", service.getContact("8").getfirstName(), "Frst name not updated.");
	}
@DisplayName("test for last name.")
	static void testupdateLastName() throws Exception {
		ContactService service = new ContactService();
		service.addContact("PHD. ", "Buddy", "555-555-5555", "310 Forest Lane");
		service.updatelastName("Bee", "18");
		service.displayContactList();
		assertEquals("Bee", service.getContact("18").getlastName(), "Last name not updated.");
	}


	@BeforeEach
	@DisplayName("Test for phone number. ")
	static void testupdatePhoneNumber() throws Exception {
		ContactService service = new ContactService();
		service.addContact("PHD. ", "Buddy", "555-555-5555", "310 Forest Lane");
		service.updatefirstName("5555555111", "81");
		service.displayContactList();
		assertEquals("5555555111", service.getContact("81").getNumber(), "Phone number not updated.");
	}


	@AfterEach
	static void testupdateAddress() throws Exception {
		ContactService service = new ContactService();
		service.addContact("PHD. ", "Buddy", "555-555-5555", "310 Forest Lane");
		service.updateAddress("619 Liberty Ave", "88");
		service.displayContactList();
		assertEquals("619 Liberty Ave", service.getContact("88").getAddress(), "Address name not updated.");
	}


	@Test
	@DisplayName("Test for deleting contacts")
	static void testupdateFirstName() throws Exception {
		ContactService service = new ContactService();
		service.addContact("PHD. ", "Buddy", "555-555-5555", "310 Forest Lane");
		service.deleteContact("19");
		ArrayList<Contact>contactListEmpty = new ArrayList<Contact>();
		service.displayContactList();
		assertEquals(service.getContact,contactListEmpty, "It was deleted");
	}
	@Test
	@DisplayName("test for add a contact")
	static void testAddContact() throws Exception {
		ContactService service = new ContactService();
		service.addContact("PHD. ", "Buddy", "555-555-5555", "310 Forest Lane");
		service.displayContactList();
		assertNotNull(service.getContact("0"), "contact was not added.");
	}


}
