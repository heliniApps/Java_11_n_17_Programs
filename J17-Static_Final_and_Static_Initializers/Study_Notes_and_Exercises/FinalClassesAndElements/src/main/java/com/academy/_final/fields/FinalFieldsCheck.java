package com.academy._final.fields;

public class FinalFieldsCheck {

    // private final int instanceCount1 = 0;

    private final int instanceCount2;
    private final int instanceCount3;
    private static int staticCount = 0;
    private final String insName;

    public final int publicFinalVar = staticCount;  /* VALID */


    public FinalFieldsCheck(String name) {
        /*
         * Since, the 'instanceCount1' field is already initialised with a value,
         * below statement of reassigning a value in the Constructor is INVALID.
         * Causes COMPILE ERROR.
         */
        // this.instanceCount1 = 1;

        /*
         * Below assignment is VALID, as the "final" variable is never assigned
         * with a value before.
         */
        this.instanceCount2 = 0;

        /* Value for the "final" field is passed in as a method argument. */
        this.insName = name;

        staticCount++;
        this.instanceCount3 = staticCount;

        System.out.println(this.insName + " :: instanceCount3 = " + this.instanceCount3);
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public int getInstanceCount3() {
        return this.instanceCount3;
    }

    public String getInstanceName() {
        return this.insName;
    }
}
