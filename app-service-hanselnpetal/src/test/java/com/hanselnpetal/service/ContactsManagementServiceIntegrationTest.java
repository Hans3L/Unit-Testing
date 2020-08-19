package com.hanselnpetal.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.hanselnpetal.domain.CustomerContact;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class ContactsManagementServiceIntegrationTest {

	
	@Autowired(required = true)
	private ContactsManagementService contactsManagementService;
	
	@Test
	public void testAddContactHappyPath() {
		
		// Create a contact
		CustomerContact aContact = new CustomerContact();
		aContact.setFirstName("Jenny");
		aContact.setLastName("Johnson");
		aContact.setEmail("jennyJohnson@gmail.com");
		aContact.setDeliveryAddressCity("Lima");
		aContact.setDeliveryAddressLine1("Avenue Sun 501");
		aContact.setDeliveryAddressLine2("MZ S5 LT 36");
		aContact.setDeliveryAddressLZipCode("13564");
		aContact.setDeliveryAddressState("Kansas");

		// Test adding the contact
		CustomerContact newCustomer = contactsManagementService.add(aContact);

		// Comparing and verify
		Assert.assertEquals(newCustomer.getFirstName(),"Jenny");
		Assert.assertNotNull(newCustomer.getId());
		Assert.assertNotNull(newCustomer);
		//Assert.assertEquals(aContact.getFirstName(),"Jenny");
		Assert.assertEquals(newCustomer.getLastName(), "Johnson");
		Assert.assertEquals(newCustomer.getEmail(), "jennyJohnson@gmail.com");
		Assert.assertEquals(newCustomer.getDeliveryAddressCity(), "Lima");
		Assert.assertEquals(newCustomer.getDeliveryAddressLine1(), "Avenue Sun 501");
		Assert.assertEquals(newCustomer.getDeliveryAddressLine2(), "MZ S5 LT 36");
		Assert.assertEquals(newCustomer.getDeliveryAddressLZipCode(), "13564");
		Assert.assertEquals(newCustomer.getDeliveryAddressState(), "Kansas");
	}
}
