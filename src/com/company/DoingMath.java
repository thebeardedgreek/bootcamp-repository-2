package com.company;
public class DoingMath
{
    public static void main( String[] args )
    {
        int a, b, c, d, e;
        double x, y, z;
        String one, two, red, blue;

        a = 5;
        b = 10;
        c = a + b;
        System.out.println( "a is " + a + ", b is " + b );
        System.out.println( "a + b is " + c );
        d = a - b;
        System.out.println( "a - b is " + d );
        e = a * b;
        System.out.println( "a * b is " + e );
        e = a / b;
        System.out.println( "a / b is " + e );
        e = b / a;
        System.out.println( "b / a is " + e );
        e = a % b;
        System.out.println( "a % b is " + e );
        e = b % a;
        System.out.println( "b % a is " + e );

        x = 1.5;
        System.out.println( "x is " + x );
        y = x * x;
        System.out.println( "x * x is " + y );
        z = b / 3;
        System.out.println( "b / 3 is " + z );
        System.out.println();

        one = "one";
        two = "two";
        red = "red";
        blue = "blue";
        System.out.print( one + " fish " + two + " fish ");
        System.out.println(red + " fish " + blue + " fish");

        // another way to print is...
        // use %s as a placeholder for strings, %d as a placeholder
        // for integers and %f for floating point decimals
        System.out.printf("%s fish %s fish %s fish %s fish", one, two, red, blue);
    }
}