package com.creativity.example.games;

import org.assertj.core.util.Arrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Collections;

public class EmailsTest {

    private Emails emails;

    @Before
    public void before(){
        this.emails = new Emails("foo hansel.hir@gmail.com  wdas hingaruc@yopmail.com 1544");
    }

    @Test
    public void testUserBasic(){
        Assert.assertEquals(Arrays.asList(new String[]{"hansel.hir", "hingaruc"}), emails.getUsers());
        // Nota: Arrays.asList (...) es una forma práctica de hacer que la lista sea literal.
        // Tenga en cuenta también que .equals () funciona para colecciones, por lo que lo anterior funciona.
    }

    //Caracteres extraños: presiona qué caracteres están permitidos
    @Test
    public void testUserChars(){
        Emails emails1 = new Emails("fo f.ast@cs.edu bar&a.2.c@ms.com ");
        Assert.assertEquals(Arrays.asList(new String[] {"f.ast" , "a.2.c"}), emails1.getUsers());
    }

    //Casos duros: presionar en casos extremos inusuales
    @Test
    public void testUserHard(){
        Emails emails2 = new Emails("x y@cs 3@ @z@");
        Assert.assertEquals(Arrays.asList(new String[] {"y", "3", "z"}), emails2.getUsers());

        // No emails (2 metodos iguales)
        emails2 = new Emails("¡No hay correos electrónicos aquí!");
        Assert.assertEquals(Arrays.asList(new String[]{}),emails2.getUsers());
        Assert.assertEquals(Collections.emptyList(),emails2.getUsers());

        // T0d0 @, t0d0 el tiempo!
        emails2 = new Emails("@@@");
        Assert.assertEquals(Arrays.asList(new String[]{}),emails2.getUsers());

        // Cadena vacia
        emails2 = new Emails("");
        Assert.assertEquals(Arrays.asList(new String[]{}),emails2.getUsers());
    }
}
