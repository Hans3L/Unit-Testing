package com.hanselnpetal.controller;

import com.hanselnpetal.domain.ContactImportantOccasion;
import com.hanselnpetal.domain.CustomerContact;
import com.hanselnpetal.service.ContactsManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactsManagementController {

    @Autowired
    @Qualifier("contactsManagerService")
    private ContactsManagementService contactsManagementService;

    @RequestMapping(value= "/addContact", method=RequestMethod.POST)
    public String processAddContactSubmit(@ModelAttribute CustomerContact aContact) {

        CustomerContact newContact = contactsManagementService.add(aContact);

        if (newContact != null) {
            return "/addContactForm";
        }

        return "redirect:/showAddContact";
    }

    @RequestMapping(value= "/showAddContact", method=RequestMethod.GET)
    public String showAddContact() {

        // implement this

        return "/addContactForm";
    }

    public String processAddContactOccasionSubmit(@ModelAttribute CustomerContact aContact,
                                                  @ModelAttribute ContactImportantOccasion anOccasion) {

        // implement this

        return "/addContactOccasionForm";
    }
}

