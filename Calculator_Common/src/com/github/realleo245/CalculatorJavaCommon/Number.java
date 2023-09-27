package com.github.realleo245.CalculatorJavaCommon;

public interface Number extends Comparable<Number> {
    /**
     * @param anotherNumber
     * @return The sum of the current {@link Number} and the {@link Number} passed in
     */
    public Number add(Number anotherNumber);
    /**
     * @param anotherNumber
     * @return The difference of the current {@link Number} and the {@link Number} passed in
     */
    public Number subtract(Number anotherNumber);
    /**
     * @param anotherNumber
     * @return The product of the current {@link Number} and the {@link Number} passed in
     */
    public Number multiply(Number anotherNumber);
    /**
     * @param anotherNumber
     * @return The quotient of the current {@link Number} and the {@link Number} passed in
     * @throws {@link ArithmeticException} when performing the division results in division by zero
     */
    public Number divide(Number anotherNumber);
    /**
     * @param anotherNumber
     * @return The remainder of the current {@link Number} divided by  {@link Number} passed in
     * @throws {@link ArithmeticException} when performing the division results in division by zero
     */
    public Number remainder(Number anotherNumber);
    /**
     * 
     * @param anotherNumber
     * @return An array of 2 {@link Number}, with the element at index 0 being the quotient, and element 1 remainder
     */
    public Number[] divideWithRemainder(Number anotherNumber);
    /**
     * @return The square root of the {@link Number}
     */
    public Number sqrt();
    /**
     * @return The cube root of the {@link Number}
     */
    public Number cbrt();
}
