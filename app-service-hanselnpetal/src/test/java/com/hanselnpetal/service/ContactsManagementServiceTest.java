package com.hanselnpetal.service;

import com.hanselnpetal.data.repos.CustomerContactRepository;
import com.hanselnpetal.domain.CustomerContact;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class ContactsManagementServiceTest {

    @Mock
    private CustomerContactRepository contactRepositoryMock;

    @InjectMocks
    private ContactsManagementService contactsManagementService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddContactSuccessHappyPath() {
        CustomerContact MockContact = new CustomerContact();
        MockContact.setFirstName("Hansel");
        when(this.contactRepositoryMock.save(any(CustomerContact.class))).thenReturn(MockContact);
        // guardar contacto
         CustomerContact customerContact = this.contactsManagementService.add(MockContact);
        Assert.assertEquals("Hansel",customerContact.getFirstName() );
    }
}
