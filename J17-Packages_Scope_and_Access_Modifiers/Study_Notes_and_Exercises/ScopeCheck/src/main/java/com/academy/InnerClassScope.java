package com.academy;

public class InnerClassScope {

    private int privateVar = 1;

    public InnerClassScope() {
        System.out.println("\nInnerClassScope Obj is created. 'privateVar' = " + this.privateVar);
    }

    public int getPrivateVar() {
        return this.privateVar;
    }

    public void multiply() {
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            /* Accesses method local variable. */
            System.out.printf("%d * %2$d = %3$d %n", i, privateVar, (i * privateVar));
        }
    }

    /*
     * Inner Class's private instance members have "Visibility" from the Outer Class.
     * Similarly, Outer Class's private instance members have "Visibility" from Inner Class.
     */
    public void useInnerClassMembers() {
        InnerScope innerClassObj = new InnerScope();

        System.out.println("\nAccessing Inner Class's private instance variables.");
        System.out.println("innerClassObj.privateVar = " + innerClassObj.privateVar);
    }

    public class InnerScope {

        private int privateVar = 3;

        public InnerScope() {
            System.out.println("\nInner Class Obj is created. 'privateVar' = " + this.privateVar);
        }

        public void multiply() {
            for (int i = 0; i < 10; i++) {
                /*
                 * There's no 'privateVar' variable declared in the closest enclosing method's scope.
                 * Therefore, accesses the 'privateVar' variable from
                 * the enclosing Inner Class's scope. (Instance member)
                 */
                System.out.printf("%d * %2$d = %3$d %n", i, privateVar, (i * privateVar));
            }

            /* Specifically accessing the Inner Class's instance variable. */
            System.out.println("\nAccessing Inner Class's 'this.privateVar' = " + this.privateVar);

            /* Specifically accessing the enclosing Outer Class's instance variable. */
            System.out.println("\nAccessing Outer Class's 'InnerClassScope.this.privateVar' = "
                    + InnerClassScope.this.privateVar);
        }
    }
}
