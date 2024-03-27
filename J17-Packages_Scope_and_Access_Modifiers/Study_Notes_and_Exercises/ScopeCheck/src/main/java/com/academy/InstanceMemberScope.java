package com.academy;

public class InstanceMemberScope {

    private int privateVar = 1;
    public double publicInstanceVar = 4.5;

    public InstanceMemberScope() {
        System.out.println("InstanceMemberScope object is created. 'privateVar' member variable = " + this.privateVar);
    }

    public int getPrivateVar(){
        return this.privateVar;
    }

    /*
     * In the below logic, "privateVar" is searched/accessed based on the following order:
     *   'for' loop's code block.
     *   enclosing multiply() method's code block.
     *   enclosing InstanceMemberScope class's code block.
     */
    public void multiply() {
        int privateVar = 2;

        for (int i = 0; i < 10; i++) {
            /* Refers to the method local 'privateVar' variable. */
            System.out.printf("%d * %2$d = %3$d %n", i, privateVar, (i * privateVar));
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            /* "this.privateVar" specifically accesses the enclosing class or Object's
             * instance variable, named 'privateVar'.
             */
            System.out.printf("%d * %2$d = %3$d %n", i, this.privateVar, (i * this.privateVar));
        }

        // for (int i = 0; i < 10; i++) {
        //    int privateVar = 4;     // Compile ERROR :: Variable 'privateVar' is already defined in the scope
        //    System.out.printf("%d * %2$d = %3$d", i, privateVar, (i * privateVar));
        //}
    }
}
