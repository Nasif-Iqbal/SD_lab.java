// Java program to demonstrate working of method
// overloading in Java

public class Sum {
    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) { return (x + y); }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double
    // parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }

    // Driver code
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }
}

*****************single inheritance**************
// Java Program to illustrate Inheritance (concise)

import java.io.*;

// Base or Super Class
class Employee {
    int salary = 60000;
}

// Inherited or Sub Class
class Engineer extends Employee {
    int benefits = 10000;
}

// Driver Class
class Gfg {
    public static void main(String args[])
    {
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                           + "\nBenefits : " + E1.benefits);
    }
}
******************Multiple inheritance************
    // Java Doesn't support Multiple Inheritance
import java.io.*;

// First Parent Class 
class Parent1 {
    void fun() { System.out.println("Parent1"); }
}

// Second Parent Class
class Parent2 {
    void fun() { System.out.println("Parent2"); }
}

// Inheriting Properties of
// Parent1 and Parent2
class Test extends Parent1, Parent2 
{
      // main method
    public static void main(String args[])
    {
          // Creating instance of Test
        Test t = new Test();

        t.fun();
    }
}

*******************constructor***********
    // Java Program to demonstrate
// Constructor
import java.io.*;

// Driver Class
class Geeks {
  
    // Constructor
    Geeks()
    {
        super();
        System.out.println("Constructor Called");
    }

    // main function
    public static void main(String[] args)
    {
        Geeks geek = new Geeks();
    }
}
