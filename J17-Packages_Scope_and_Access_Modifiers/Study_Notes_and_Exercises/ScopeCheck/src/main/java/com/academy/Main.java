package com.academy;

public class Main {

    public static void main(String[] args) {

        testInstanceMemberScope();
        System.out.println();
        testInnerClassScope();
    }

    public static void testInstanceMemberScope() {
        InstanceMemberScope insScopeObj = new InstanceMemberScope();

        System.out.println("insScopeObj.publicInstanceVar = " + insScopeObj.publicInstanceVar);
        /* 'private' member variables are accessed via getters. */
        System.out.println("insScopeObj.getPrivateVar() = " + insScopeObj.getPrivateVar());

        insScopeObj.multiply();
    }

    public static void testInnerClassScope() {
        InnerClassScope outerClassObj = new InnerClassScope();
        InnerClassScope.InnerScope innerClassObj = outerClassObj.new InnerScope();

        innerClassObj.multiply();

        outerClassObj.useInnerClassMembers();

        // Below statement causes COMPILE ERROR,
        // because classes other than the Containing Outer Class, doesn't have Visibility
        // to the Inner Class's variables.
        /*System.out.println("Inner class's instance members from Main class. " +
                innerClassObj.privateVar);*/
    }
}
