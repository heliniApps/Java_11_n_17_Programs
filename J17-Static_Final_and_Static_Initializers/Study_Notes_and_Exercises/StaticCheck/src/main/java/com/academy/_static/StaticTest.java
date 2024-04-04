package com.academy._static;

public class StaticTest {

    private int instanceCounter = 0;
    private static int staticInsCounter = 0;
    private String instanceName;

    public StaticTest(String instanceName) {
        this.instanceName = instanceName;
        this.instanceCounter++;
        staticInsCounter++;
    }

    public int getInstanceCounter() {
        return this.instanceCounter;
    }

    /*
     * This method only handles Static members/fields of the Class.
     * Therefore, it makes more sense for it to be a 'static' method as well.
     */
    public static int getStaticInsCounter() {
        return staticInsCounter;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public static void multiplyInstanceCount() {

        // It is VALID to call Instance Members of a class within a Static method,
        // using a Class's object/instance reference.

        ClassB classBObj = new ClassB();
        int answer = classBObj.multiply(staticInsCounter);

        System.out.println("Multiplied Static Count = " + answer);
    }
}
