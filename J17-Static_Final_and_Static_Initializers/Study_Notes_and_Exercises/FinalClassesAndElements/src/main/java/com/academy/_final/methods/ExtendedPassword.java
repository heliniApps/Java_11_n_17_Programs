package com.academy._final.methods;

public class ExtendedPassword extends Password {

    private final int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;  // Plain text password is assigned to this field.
    }

    /*
     * In this case "storePassword()" method is overridden in this subclass
     * to save the password into the database as plain text,
     * which poses a security risk.
     *
     * Situations like this can be avoided by
     * declaring the "storePassword()" method in the 'Parent class' as a "final" method.
     * It restricts subclasses from overriding the method and changing the desired behaviour.
     */
    @Override
    public void storePassword() {
        System.out.println("Storing decrypted password (original value). Stored password is " +
                this.decryptedPassword);
    }
}
