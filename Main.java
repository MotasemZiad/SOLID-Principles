import java.util.Scanner;
import OCP.ManagerEmployee;
import OCP.RegularEmployee;


public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World");
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = in.nextLine();
        // System.out.println("Enter your age");
        // int age = in.nextInt();
        // System.out.println("Hello " + name + ", You are " + age + " years old.");

        ManagerEmployee employee1 = new ManagerEmployee("1", "Mohamed Reda", 2000.0);
        RegularEmployee employee2 = new RegularEmployee("2", "Ahmed Ali", 800.0);

        
        // System.out.println(employee1.toString() + "\nBonus: " + employee1.calcHoursBonus(5) + "");
        // System.out.println(employee2.toString() + "\nBonus: " + employee2.calcHoursBonus(5) + "");
        System.out.println(employee1.toString() + "\nBonus: " + employee1.calcHoursBonusUsingInterface(5) + "");
        System.out.println(employee2.toString() + "\nBonus: " + employee2.calcHoursBonusUsingInterface(5) + "");

    }

    // SOLID Principles: It is a mnemonic acronym for five design principles
    // intended to make object-oriented designs more understandable, flexible, and
    // maintainable.

    /*
     * 1. Single Responsibility: the class should solve only one problem it should
     * have a single reason to change.
     * 2. Open/Closed: the class should be open for extension, closed for
     * modification.
     * 3. Liskov Substitution: if you substitute any type with one of its subtypes,
     * the behavior should not change.
     * 4. Interface Segregation: avoid making a general interface contain all
     * methods.
     * 5. Dependency Inversion: higher level classes should not know the
     * implementation of low level classes but depends on abstraction.
     */

    // 1. Single Responsibility Principle (S.R.P)
    // Helps us with Code Reusability.
    // It should be executed on both classes and methods.

    // 2. Open/Closed Principle (O.C.P)
    // Any new functionality should be done by adding new classes instead of
    // changing existing one.
    // How to implement this?
    // a. By adding new functionality to derived classes.
    // b. Allow client access the original class with an abstract interface.

    // 2. Liskov Substitution Principle (L.S.P) 
    // 
}