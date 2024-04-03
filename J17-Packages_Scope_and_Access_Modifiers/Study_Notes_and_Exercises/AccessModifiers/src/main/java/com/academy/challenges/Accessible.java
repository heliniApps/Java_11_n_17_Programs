package com.academy.challenges;


interface Accessible {

    int SOME_CONSTANT = 100;

    public void methodA();

    void methodB();

    boolean methodC();
}


// Challenge:
// In the above interface declaration, what is the visibility of:
//
// 1. the Accessible interface?
/*
 * "Accessible" interface has the 'package-private (default)' access.
 * It is visible to objects anywhere within its own package (com.academy.challenges).
 * It is not visible to classes/objects outside its declared package, and can't be implemented.
 */

// 2. the int variable SOME_CONSTANT?
/*
 * All constants declared in an Interface have 'public' access. (public, static and final)
 * Therefore, this constant can be accessed anywhere in the program, both its own package,
 * and external packages.
 * Yet, since the Interface only has 'package-private' access, currently,
 * this constant will be visible within its declared package.
 */

// 3. methodA?
/*
 * All methods declared in an Interface have 'public' access.
 * Yet, since the Interface only has 'package-private' access, currently,
 * this constant will be visible within its declared package.
 * Specifying the 'public' access modifier in the "methodA" declaration, is redundant.
 */

// 4. methodB and methodC?
/*
 * All methods declared in an Interface have 'public' access.
 * Yet, since the Interface only has 'package-private' access, currently,
 * this constant will be visible within its declared package.
 */