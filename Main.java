import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Enter your age");
        int age = in.nextInt();
        System.out.println("Hello " + name + ", You are " + age + " years old.");
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

}
