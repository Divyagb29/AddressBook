package com.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    public void takeUserInputs()
    {
        System.out.println("---------------------------------");
        System.out.println("Add contacts to the address book");
        System.out.println("---------------------------------");
        System.out.println("Enter First_Name : ");
        String firstname = sc.next();
        System.out.println("Enter Last_Name : ");
        String lastname = sc.next();
        System.out.println("Enter Address : ");
        String address = sc.next();
        System.out.println("Enter City : ");
        String city = sc.next();
        System.out.println("Enter State : ");
        String state = sc.next();
        System.out.println("Enter Pin_Code : ");
        int pin = sc.nextInt();
        System.out.println("Enter Phone_Number : ");
        int phone = sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("*******WECLOME TO ADDRESS BOOK APPLICATION*******");
        AddressBook ab = new AddressBook();
        ab.takeUserInputs();
    }
}
