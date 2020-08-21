package com.hanselnpetal.controller;

import com.hanselnpetal.domain.CustomerContact;
import com.hanselnpetal.service.ContactsManagementService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContactsManagementControllerFirstShapeTest {

    @Mock
    private ContactsManagementService contactsManagementServiceMock;

    @InjectMocks
    private ContactsManagementController contactsManagementController;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPrimeraFormaAddContactSubmit() {
        CustomerContact newCustomer = new CustomerContact();
        newCustomer.setFirstName("Hansel");
        when(contactsManagementServiceMock.add(any())).thenReturn(newCustomer);
        Assert.assertEquals("/addContactForm", contactsManagementController.processAddContactSubmit(newCustomer));
    }
}
