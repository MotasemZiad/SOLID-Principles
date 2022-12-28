import DIP.Gmail;
import DIP.Hotmail;
import DIP.Notification;

public class Main {

        public static void main(String[] args) {

                // Inject Dependencies
                // Constructor Injection
                Notification gmailNotification = new Notification(new Gmail("address", "miziad2000@gmail.com",
                                "moatasem.abunema@gmail.com"));
                gmailNotification.sendMail();

                // Method Injection
                Notification hotmailNotification = new Notification();
                hotmailNotification.sendMail(new Hotmail("address", "miziad2000@gmail.com",
                                "moatasem.abunema@gmail.com"));

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

        /*
         * 1. Single Responsibility Principle (S.R.P)
         * Helps us with Code Reusability.
         * It should be executed on both classes and methods.
         * 
         * 2. Open/Closed Principle (O.C.P)
         * Any new functionality should be done by adding new classes instead of
         * changing existing one.
         * How to implement this?
         * a. By adding new functionality to derived classes.
         * b. Allow client access the original class with an abstract interface.
         * 
         * 3. Liskov Substitution Principle (L.S.P)
         * "If you have class B inherits from class A then class A should be replaceable
         * by class B without any changes"
         * 
         * 4. Interface Segregation (I.S.P)
         * "Clients should not be forced to depend on methods they do not use"
         * a. Avoid fat interface
         * b. Client must not implement unnecessary methods
         * 
         * 5. Dependency Inversion Principle (D.I.P)
         * "High level modules should not depend upon low level modules.
         * Both should depend upon abstraction"
         * Dependency Inversion is a principle. Dependency Injection is the
         * implementation of this principle.
         * We should not depend on concrete classes. we should depend on abstract
         * classes.
         * Tightly Coupling VS. Loosely Coupling
         * Coupling VS. Cohesion
         * Coupling describes the relationships between modules, and Cohesion describes
         * the relationships within them.
         * Usually low coupling and high cohesion is good for software.
         */

}
