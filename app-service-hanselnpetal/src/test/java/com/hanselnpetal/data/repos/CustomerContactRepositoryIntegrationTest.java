package com.hanselnpetal.data.repos;

import com.hanselnpetal.domain.CustomerContact;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.isEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase
public class CustomerContactRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Qualifier("customerContactRepository")
    @Autowired
    private CustomerContactRepository customerContactRepository;

    @Test
    public void testFindByEmail(){

        // configurar escenario de la data
        CustomerContact contact = new CustomerContact();
        contact.setEmail("Hansel.hir@protonmail.com");
        testEntityManager.persist(contact);
        // Buscar un insertado grabado usando repository class
          CustomerContact customerContact = this.customerContactRepository.findByEmail("Hansel.hir@protonmail.com");
        // Afirmación
        Assert.assertEquals("Hansel.hir@protonmail.com",customerContact.getEmail());
    }


}
