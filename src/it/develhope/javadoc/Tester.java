package it.develhope.javadoc;
/**
 The Tester class provides a main method to test the ArithmeticOperators class.
 Autore: Ionut
 */
public class Tester
{
    public static void main(String args[])
    {
        ArithmeticOperators ArithmeticOperators=new ArithmeticOperators();
        System.out.println("summation "+ArithmeticOperators.sum(100,10));
        System.out.println("subtraction "+ArithmeticOperators.sub(100,10));
        System.out.println("multiplication "+ArithmeticOperators.mul(100,10));
        System.out.println("division "+ArithmeticOperators.div(100,10));
    }
}

