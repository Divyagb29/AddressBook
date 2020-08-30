package com.addressbook;

import java.util.Scanner;

public class Person
{
    Scanner sc = new Scanner(System.in);
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    int pin;
    int phone;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLastname() {
        return lastname;
    }

    public String getState() {
        return state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void takeUserInputs()
    {
        for(int i=1;i<=10;i++) {
            System.out.println("---------------------------------");
            System.out.println("Add contacts to the address book "+" Contact "+i);
            System.out.println("---------------------------------");
            System.out.println("Enter First_Name : ");
            firstname = sc.next();
            System.out.println("Enter Last_Name : ");
            lastname = sc.next();
            System.out.println("Enter Address : ");
            address = sc.next();
            System.out.println("Enter City : ");
            city = sc.next();
            System.out.println("Enter State : ");
            state = sc.next();
            System.out.println("Enter Pin_Code : ");
            pin = sc.nextInt();
            System.out.println("Enter Phone_Number : ");
            phone = sc.nextInt();
        }
    }
}
