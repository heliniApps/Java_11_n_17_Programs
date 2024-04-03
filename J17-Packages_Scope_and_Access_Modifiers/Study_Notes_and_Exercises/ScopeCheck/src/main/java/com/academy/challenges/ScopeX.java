package com.academy.challenges;

public class ScopeX {

    public static void main(String[] args) {

        X x = new X(5);
        x.x();
    }
}

/**
 * Understanding the Scope of variables and methods using the same name. (e.g.: x())
 */
class X {

    private int x = 0;

    public X(int x) {
        System.out.println("X obj is created.");
        this.x = x;
    }

    public void x() {
        long x = Math.round(Math.random() * 10);

        for (int y = 0; y <= 12; y++) {
            System.out.printf("%d * %d = %d %n", y, x, (y * x));    // 'x' used in this logic is the local variable.
        }

        // Compile ERROR:
        // variable name "x" is already defined within this method,
        // and it's scope and visibility extends into the "for" loop as well.
        // Therefore, can't use 'x' as the loop iterator.
        /* for (int x = 0; x <= 12; x++) ; */
    }
}
