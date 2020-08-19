package com.hanselnpetal.controller;

import com.hanselnpetal.domain.CustomerContact;
import com.hanselnpetal.service.ContactsManagementServiceIntegrationTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class ContactsManagementControllerIntegrationTest {

    Logger LOG = LogManager.getLogger(ContactsManagementServiceIntegrationTest.class);

    @Autowired
    private ContactsManagementController contactsManagementController;

    @Test
    public void testAddContactHappyPath() {

        CustomerContact cContact = new CustomerContact();
        cContact.setFirstName("Hansel");
        cContact.setLastName("Ingaruca Rimac");

        // String newContact = contactsManagementController.processAddContactSubmit(cContact);

        Assert.assertEquals(this.contactsManagementController.processAddContactSubmit(cContact), "success");
        LOG.info("Datos a comparar 1 --> " + cContact);
    }

    @Test
    public void testAddContactFirstNameMissing() {

        CustomerContact customerContact = new CustomerContact();
        String empty = contactsManagementController.processAddContactSubmit(customerContact);

        Assert.assertEquals(empty, "failure");
    }

    @Test
    public void testEmpty() {
        try {
            this.contactsManagementController.processAddContactSubmit(null);
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }
}
