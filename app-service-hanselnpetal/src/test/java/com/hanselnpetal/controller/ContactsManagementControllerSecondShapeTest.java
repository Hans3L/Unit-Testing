package com.hanselnpetal.controller;

import com.hanselnpetal.domain.CustomerContact;
import com.hanselnpetal.service.ContactsManagementService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ContactsManagementController.class)
public class ContactsManagementControllerSecondShapeTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    @Qualifier("contactsManagerService")
    private ContactsManagementService contactsManagementServiceMock;

    @InjectMocks
    private ContactsManagementController contactsManagementController;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSegundaFormaAddContactSubmit() throws Exception {
        //instanciar CustomerContact como mock de configuración y que regrese el componente de Service mock
        CustomerContact customerContactMock = new CustomerContact();
        customerContactMock.setEmail("hansel.hir@myemail.com");
        customerContactMock.setDeliveryAddressCity("Lima");
        when(this.contactsManagementServiceMock
                .add(any(CustomerContact.class)))
                .thenReturn(customerContactMock);
        //simular el Bean form que se publicaría desde la página web
        CustomerContact aContact = new CustomerContact();
        aContact.setFirstName("Richie");
        aContact.setLastName("Smith");
        //simular el envio del form (POST)
        mockMvc
                .perform(post("/addContact", aContact))
                .andExpect(status().isOk()).andReturn();
    }

    @Test
    public void testAddContactBizServiceRuleNotSatisfied() throws Exception{
        // retornar un valor null
        when(this.contactsManagementServiceMock.add(any(CustomerContact.class))).thenReturn(null);
        CustomerContact cContact = new CustomerContact();
        cContact.setFirstName("Hansel");
        mockMvc
                .perform(post("/addContact",cContact))
                .andExpect(status().is(302)).andReturn();
    }
}
