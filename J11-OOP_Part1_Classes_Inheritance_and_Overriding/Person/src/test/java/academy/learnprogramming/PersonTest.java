package academy.learnprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFirstName() {
        Person person = new Person();
        person.setFirstName("Jane");
        assertEquals("Jane", person.getFirstName());
    }

    @Test
    void getLastName() {
        Person person = new Person();
        person.setLastName("Doe");
        assertEquals("Doe", person.getLastName());
    }

    @Test
    void getAge() {
        Person person = new Person();
        person.setAge(34);
        assertEquals(34, person.getAge());

        person.setAge(-1);
        assertEquals(0, person.getAge());
    }

    @Test
    void isTeen() {
        Person person = new Person();
        person.setAge(34);
        assertFalse(person.isTeen());

        person.setAge(14);
        assertTrue(person.isTeen());
    }

    @Test
    void getFullName() {
        Person person = new Person();
        person.setFirstName("Jane");
        person.setLastName("Doe");
        assertEquals("Jane Doe", person.getFullName());

        person.setFirstName("Jane");
        person.setLastName("   ");
        assertEquals("Jane", person.getFullName());

        person.setFirstName("   ");
        person.setLastName("Doe");
        assertEquals("Doe", person.getFullName());

        person.setFirstName("");
        person.setLastName("");
        assertEquals("", person.getFullName());
    }
}