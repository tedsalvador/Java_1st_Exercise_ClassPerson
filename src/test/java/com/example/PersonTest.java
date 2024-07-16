package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testPersona() {
        Person person = new Person("Juan", "Perez", "12345678", 1990,"Brasil",'H');

        assertEquals("Juan", person.getName());
        assertEquals("Perez", person.getFirstName());
        assertEquals("12345678", person.getNumberDocument());
        assertEquals(1990, person.getYearBirth());
        //Part_2
        assertEquals("Brasil", person.getCountryBirth());
        assertEquals('H', person.getPersonGenere());
    }
}
