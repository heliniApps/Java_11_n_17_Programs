package com.academy;

import java.util.Scanner;

public class MobilePhone {

    private static final String ENTER_NAME_MESSAGE = "Enter contact name: ";
    private static final String ENTER_PHONE_NUMBER_MESSAGE = "Enter contact phone number: ";
    private static final String ENTER_NEW_NAME_MESSAGE = "Enter new contact name: ";
    private static final String ENTER_NEW_PHONE_NUMBER_MESSAGE = "Enter new contact phone number: ";
    private static final String ENTER_MODIFY_NAME_MESSAGE = "Enter contact name to modify: ";
    private static final String ENTER_DELETE_NAME_MESSAGE = "Enter contact name to delete: ";

    private Scanner scanner;
    private ContactList contactList;

    public MobilePhone() {
        scanner = new Scanner(System.in);
        contactList = new ContactList();
    }

    public void handleContacts() {

        Contact contact;
        String name = "";
        String phoneNumber = "";
        boolean isContinue = true;

        printOptionsMenu();

        while (isContinue) {

            int option = readOption();

            switch (option) {
                case 1: // print menu
                    printOptionsMenu();
                    break;

                case 2: // contact name search
                    name = readContactName(ENTER_NAME_MESSAGE);
                    contact = contactList.searchContact(name, null);
                    if (contact != null) {
                        contact.printDetails();
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3: // phone number search
                    phoneNumber = readContactPhoneNumber(ENTER_PHONE_NUMBER_MESSAGE);
                    contact = contactList.searchContact(null, phoneNumber);
                    if (contact != null) {
                        contact.printDetails();
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4: // Add contact
                    name = readContactName(ENTER_NEW_NAME_MESSAGE);
                    phoneNumber = readContactPhoneNumber(ENTER_NEW_PHONE_NUMBER_MESSAGE);
                    contact = new Contact(name, phoneNumber);

                    boolean isAdded = contactList.addContact(contact);
                    if (!isAdded) {
                        System.out.println("Contact not added.");
                    }
                    break;

                case 5: // Modify contact
                    name = readContactName(ENTER_MODIFY_NAME_MESSAGE);
                    contact = contactList.searchContact(name, null);

                    name = readContactName(ENTER_NEW_NAME_MESSAGE);
                    phoneNumber = readContactPhoneNumber(ENTER_NEW_PHONE_NUMBER_MESSAGE);
                    Contact newContact = new Contact(name, phoneNumber);

                    contact = contactList.modifyContact(contact, newContact);

                    if (contact != null) {
                        contact.printDetails();
                    } else {
                        System.out.println("Contact not modified.");
                    }
                    break;

                case 6: // Delete contact
                    name = readContactName(ENTER_DELETE_NAME_MESSAGE);
                    contact = contactList.removeContact(name);

                    if (contact != null) {
                        contact.printDetails();
                    } else {
                        System.out.println("Contact not deleted.");
                    }
                    break;

                case 7:
                    isContinue = false;
                    break;
            }
        }
    }

    private int readOption() {

        System.out.println("\nPlease enter the valid number to select an option: ");

        int option = 0;

        if (scanner.hasNextInt()) {
            option = scanner.nextInt();
        } else {
            System.out.println("Invalid Option.");
        }
        scanner.nextLine();

        return option;
    }

    private String readContactName(String message) {

        System.out.println("\n" + message.trim());
        String name = scanner.nextLine();

        return name;
    }

    private String readContactPhoneNumber(String message) {

        System.out.println("\n" + message.trim());
        String phoneNumber = scanner.nextLine();

        return phoneNumber;
    }

    private void printOptionsMenu() {
        System.out.println("\n");
        System.out.println("Option 1: Print options menu.");
        System.out.println("Option 2: Search contact by contact name.");
        System.out.println("Option 3: Search contact by phone number.");
        System.out.println("Option 4: Add a new contact.");
        System.out.println("Option 5: Modify existing contact.");
        System.out.println("Option 6: Remove a contact.");
        System.out.println("Option 7: Quit program.");
    }

    public void exitContactsApp() {
        scanner.close();
    }
}
