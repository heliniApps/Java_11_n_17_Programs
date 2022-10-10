package com.academy;

/**
 * A complex number is a number that can be expressed in the form a + bi.
 * 'a' and 'b' are real numbers, and 'i' is a solution of the equation x2 = −1.
 */
public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        if (complexNumber == null) {
            return;
        }
        this.add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        if (complexNumber == null) {
            return;
        }
        this.subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}
