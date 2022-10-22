package com.academy;

import java.util.ArrayList;

/**
 * A List of Contacts.
 * Add, Modify, Remove and Search Contacts.
 */
public class ContactList {

    private ArrayList<Contact> contactList;

    public ContactList() {
        contactList = new ArrayList<Contact>();
    }

    public ContactList(ArrayList<Contact> contactList) {
        if (contactList != null) {
            this.contactList = contactList;
        } else {
            this.contactList = new ArrayList<Contact>();
        }
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    /**
     * Add a new Contact.
     * @param contact - new Contact object/information to be added.
     */
    public boolean addContact(Contact contact) {

        if (!isValidContact(contact)){
            return false;
        }

        if (!contactList.contains(contact)) {
            return contactList.add(contact);
        }

        return false;
    }

    /**
     * Searches the Contact by either Name or Phone Number, or both.
     * @param name - If a value is provided, contact will be searched using the specified value.
     * @param phoneNumber - If a value is provided, contact will be searched using the specified value.
     * @return - returns the index, if the Contact is found. If not found, returns -1.
     */
    public Contact searchContact(String name, String phoneNumber) {

        Contact contact = new Contact(name, phoneNumber);
        int index = search(contact);

        if (index != -1) {
            return contactList.get(index);
        }
        return null;
    }

    public Contact searchContact(Contact contact) {

        int index = search(contact);

        if (index != -1) {
            return contactList.get(index);
        }
        return null;
    }

    private int search(Contact contact) {

        if (contact == null) {
            return -1;
        }

        int index = 0;

        if (isValidContactName(contact.getName()) && isValidPhoneNumber(contact.getPhoneNumber())) {
            index = contactList.indexOf(contact);

        } else if (isValidContactName(contact.getName())) {
            index = searchByName(contact.getName());

        } else if (isValidPhoneNumber(contact.getPhoneNumber())) {
            index = searchByPhoneNumber(contact.getPhoneNumber());
        }

        return index;
    }

    private int searchByName(String name) {

        int index = -1;

        if (!isValidContactName(name)) {
            return index;
        }

        for (int i=0; i < contactList.size(); i++) {
            if (name.trim().equals(contactList.get(i).getName().trim())){
                index = i;
                break;
            }
        }

        return index;
    }

    private int searchByPhoneNumber(String phoneNumber) {

        int index = -1;

        if (!isValidPhoneNumber(phoneNumber)) {
            return index;
        }

        for (int i=0; i < contactList.size(); i++) {
            if (phoneNumber.trim().equals(contactList.get(i).getPhoneNumber().trim())){
                index = i;
                break;
            }
        }

        return index;
    }

    public Contact modifyContact(String existingContactName, Contact newContact) {

        Contact existingContact = new Contact(existingContactName, null);

        return modify(existingContact, newContact);
    }

    public Contact modifyContact(Contact existingContact, Contact newContact) {
        return modify(existingContact, newContact);
    }

    private Contact modify(Contact existingContact, Contact newContact) {

        int index = search(existingContact);

        return contactList.set(index, newContact);
    }

    public Contact removeContact(String name) {

        Contact contact = new Contact(name, null);

        return remove(contact);
    }

    public Contact removeContact(Contact contact) {
        return remove(contact);
    }

    private Contact remove(Contact contact) {

        int index = search(contact);

        return contactList.remove(index);
    }

    private boolean isValidContact(Contact contact) {

        if (contact == null) {
            return false;
        }
        if (!isValidContactName(contact.getName())) {
            return false;
        }
        if (!isValidPhoneNumber(contact.getPhoneNumber())) {
            return false;
        }

        return true;
    }

    private boolean isValidContactName(String name) {
        return ((name != null) && (!name.isBlank()));
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return ((phoneNumber != null) && (!phoneNumber.isBlank()));
    }

}
