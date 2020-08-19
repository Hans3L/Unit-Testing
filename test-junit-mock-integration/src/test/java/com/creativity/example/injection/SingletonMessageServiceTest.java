package com.creativity.example.injection;

import org.apache.logging.log4j.LogManager;
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
public class SingletonMessageServiceTest {
    /* Una prueba no es una prueba unitaria si:
     *    Habla con la base de datos
     *    Se comunica a través de la red.
     *    Toca el sistema de archivos
     *    No se puede ejecutar al mismo tiempo que cualquiera de sus otras pruebas unitarias
     *    Tienes que hacer cosas especiales en tu entorno
     *   (como editar archivos de configuración) para ejecutarlo.
     */

    @Autowired
    private SingletonMessageService singletonMessageService;

    @Test
    public void testGetMessage(){
        Assert.assertTrue(singletonMessageService.getMessage().length() > 0);
        LogManager.getLogger(this.getClass()).info("====> message:  "+ singletonMessageService.getMessage());
    }
}
