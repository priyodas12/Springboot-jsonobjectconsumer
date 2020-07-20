package io.microservice.JsonObjectConsumer.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;


public class Customer {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private Address address;
    private String [] phoneNumbers;

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }
    public Customer(){

    }
    public Customer(String firstName, String lastName, String gender, int age, Address address, String[] phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
