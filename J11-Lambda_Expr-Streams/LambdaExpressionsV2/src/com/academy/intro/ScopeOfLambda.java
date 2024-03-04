package com.academy.intro;

import com.academy.model.Data;
import com.academy.model.Employee;

/**
 * When the code runs, Lambda Expressions are treated as "Nested Code Blocks",
 * but not an actual Anonymous Class.
 * <p>
 * Anonymous Class doesn't have a class name.
 * But the Lambda Expression can use the parent class's name.
 */

public class ScopeOfLambda {

    public void lambdaScopeWithForLoop() {
        /*
         * In each iteration of the "for loop", a new Employee type variable is created and,
         * a new list item is assigned.
         * Therefore, "employee" variable is effectively final (no need to declare as "final").
         * It can be used inside a Lambda Expression's scope.
         * */
        for (Employee employee : Data.employees) {
            new Thread(() -> System.out.println(employee)).start();
        }

        /* Using method reference. */
//        Data.employees.forEach(System.out::println);
    }

    /*
     * By the time the "number" is printed by the Thread,
     * program would have exited the enclosing scope ("printNumberThread()" method).
     * Therefore, it's important for the "number" local variable to be either final or effectively final.
     * */
    public void printNumberThread() {
        final int number = 300;

        Runnable runnable = () -> {
            int duration = 3000;
            try {
                Thread.sleep(++duration);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            // number++;   // compile error.
            System.out.println("Number = " + number);
        };

        new Thread(runnable).start();
    }

    public void lambdaExprScope() {
        int k = 0;
        System.out.println("Class name (outside Lambda Expr): " + getClass().getSimpleName());

        LowerConcat lc = (s1, s2) -> {
            System.out.println("Class name (inside Lambda Expr): " + getClass().getSimpleName());
            // k++;    // compile error.
            System.out.println("k (inside Lambda Expr): " + k);

            return s2.toLowerCase().concat(" ").concat(s1.toLowerCase());
        };
        System.out.println("k (outside Lambda Expr): " + k);

        printString(lc, Data.employees.get(5).getName(), Data.employees.get(6).getName());
    }

    /*
     * NOTE::
     * When using a method's local variable inside an Anonymous Class, it must be declared "final".
     * Reason:
     * Local variable doesn't belong to the Anonymous Class instance.
     * When the anonymous class instance is created, any reference to the local variable
     * is replaced with its value at that point.
     * When the local variable value is updated within the enclosing method,
     * values of the two instances can go out of sync.
     * */
    public void anonymousClassScope() {
        int j = 0;
        System.out.println("Class name (outside Anonymous Class): " + getClass().getSimpleName());

        LowerConcat lc = new LowerConcat() {
            @Override
            public String convertLowerCaseAndConcat(String s1, String s2) {
                System.out.println("Class name (inside Anonymous Class): " + getClass().getSimpleName());
                // j++;     // compile error.
                System.out.println("j (inside Anonymous Class): " + j);

                int k = 0;
                System.out.println("k (declared within Anonymous Class): " + ++k);

                return s1.toLowerCase().concat(" ").concat(s2.toLowerCase());
            }
        };
        System.out.println("j (outside Anonymous Class): " + j);

        printString(lc, Data.employees.get(4).getName(), Data.employees.get(1).getName());
    }

    public void nestedBlockScope() {
        int i = 0;

        System.out.println("Class name (Outside nested block): " + getClass().getSimpleName());
        {
            System.out.println("Class name (within nested block): " + getClass().getSimpleName());
            i++;
            System.out.println("i (within nested block) = " + i);
        }
        System.out.println("i (outside nested block) = " + i);
    }

    public void printString(LowerConcat lc, String s1, String s2) {
        System.out.println(lc.convertLowerCaseAndConcat(s1, s2));
    }

}

interface LowerConcat {
    String convertLowerCaseAndConcat(String s1, String s2);
}

class ScopeMain {
    public static void main(String args[]) {

        ScopeOfLambda scope = new ScopeOfLambda();
        scope.nestedBlockScope();
        System.out.println();
        scope.anonymousClassScope();
        System.out.println();
        scope.lambdaExprScope();
        System.out.println();
        scope.printNumberThread();
        System.out.println();
        scope.lambdaScopeWithForLoop();
    }
}

