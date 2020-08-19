package com.hanselnpetal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.hanselnpetal.data.repos.CustomerContactRepository;
import com.hanselnpetal.domain.CustomerContact;

@Service("contactsManagerService")
public class ContactsManagementService {

	@Autowired
	@Qualifier("customerContactRepository")
	private CustomerContactRepository customerContactRepository;
	
	public CustomerContact add(CustomerContact aContact) {

		CustomerContact contact = null;

		if (aContact.getFirstName() != null){
			contact = customerContactRepository.save(aContact);
		}
		return contact;
	}
	
	/*
	public CustomerContact addContactOccasion(CustomerContact aContact, ContactImportantOccasion anOccasion) {
		CustomerContact newContact = null;
		return newContact;	
	}
	*/
}
