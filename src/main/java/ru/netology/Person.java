package ru.netology;

import java.util.OptionalInt;

public class Person {
    public final String name;
    protected final String surname;

    private Integer age;

    private String address;

    public Person(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    public boolean hasAge() {
        return (age != null);
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return (age == null) ? null : OptionalInt.of(age);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }


    @Override
    public String toString() {
        return "Person {" + "name = '" + name + ", \n surname = " + surname + ", \n age = " + age + ", \n address = " + address + '}' + '\n';
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result += surname == null ? 0 : surname.hashCode();
        result += age;
        result += address == null ? 0 : address.hashCode();

        return result;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.surname).setAge(5).setAddress(this.address);
    }

}
