package com.teste;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test //Este teste passa porque person e personClone são os mesmos objetos
    public void checkEqualityOk() {
        Person person = new Person("Barrack", "Obama");
        Person personClone = person;
        assertThat(person).isEqualTo(personClone);
    }

    @Test //Este teste não passa porque person e personClone não são os mesmos objetos
    public void checkEqualityNOk() {
        Person person = new Person("Barrack", "Obama");
        Person personClone = new Person("Barrack", "Obama");
        assertThat(person).isEqualTo(personClone);
    }

}
