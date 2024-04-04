package com.academy;

import com.academy._final.fields.FinalFieldsCheck;
import com.academy._final.methods.Bird;
import com.academy._final.methods.ExtendedPassword;
import com.academy._final.methods.Password;

public class Main {

    public static void main(String[] args) {

        /*  final field test  */
        finalFieldTest();

        System.out.println();

        /*  final method test  */
        finalMethodTestUsingAnimal();
        finalMethodTestUsingPassword();
    }

    public static void finalFieldTest() {

        FinalFieldsCheck objOne = new FinalFieldsCheck("1st Instance");
        FinalFieldsCheck objTwo = new FinalFieldsCheck("2nd Instance");
        FinalFieldsCheck objThree = new FinalFieldsCheck("3rd Instance");

        System.out.println(
                objTwo.getInstanceName() + " ::  instanceCount3 = " + objTwo.getInstanceCount3());

        System.out.println("Public final var value = " + objThree.publicFinalVar);  // ans = 2

        /*
         * Below assignment causes COMPILE ERROR.
         * Although the variable has 'public' access, it is marked 'final'.
         * Therefore, the value cannot be changed after the initial assignment.
         */
        // objOne.publicFinalVar = 30;
    }


    public static void finalMethodTestUsingAnimal() {
        Bird parrot = new Bird("Parrot");
        parrot.eat();
        parrot.fly();
        parrot.move();  // Final method, inherited from the 'super' class.
    }

    public static void finalMethodTestUsingPassword() {
        int userPassword = 234353;
        Password password = new Password(userPassword);

        password.storePassword();   /* storing the Encrypted password. */

        password.validate(4566);
        password.validate(-1);
        password.validate(0);
        password.validate(999909);
        password.validate(234353);

        System.out.println();

        // Extended Password subclass
        Password extPassword = new ExtendedPassword(userPassword);

        extPassword.storePassword();    /* storing the plain text password. */

        extPassword.validate(2389);
        extPassword.validate(-1);
        extPassword.validate(0);
        extPassword.validate(999909);
        extPassword.validate(234353);
    }
}