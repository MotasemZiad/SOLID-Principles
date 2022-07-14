import java.util.ArrayList;

import DIP.Notification;
import LSP.LinkPost;
import LSP.MentionPost;
import LSP.Post;
import LSP.PostDatabase;
import LSP.TagPost;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello World");
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = in.nextLine();
        // System.out.println("Enter your age");
        // int age = in.nextInt();
        // System.out.println("Hello " + name + ", You are " + age + " years old.");

        // ManagerEmployee employee1 = new ManagerEmployee("1", "Mohamed Reda", 2000.0);
        // RegularEmployee employee2 = new RegularEmployee("2", "Ahmed Ali", 800.0);

        // // System.out.println(employee1.toString() + "\nBonus: " +
        // employee1.calcHoursBonus(5) + "");
        // // System.out.println(employee2.toString() + "\nBonus: " +
        // employee2.calcHoursBonus(5) + "");
        // System.out.println(employee1.toString() + "\nBonus: " +
        // employee1.calcHoursBonusUsingInterface(5) + "");
        // System.out.println(employee2.toString() + "\nBonus: " +
        // employee2.calcHoursBonusUsingInterface(5) + "");

        // PostDatabase db = new PostDatabase();
        // ArrayList<String> newPosts = new ArrayList<String>();
        // newPosts.add("original post");
        // newPosts.add("#tag post");
        // newPosts.add("@mention post");
        // newPosts.add("https://github.com/motasemziad/");

        // Post postObj;
        // for (String post : newPosts) {
        // if (post.startsWith("#")) {
        // postObj = new TagPost();
        // } else if (post.startsWith("@")) {
        // postObj = new MentionPost();
        // } else if (post.startsWith("https://")) {
        // postObj = new LinkPost();
        // } else {
        // postObj = new Post();
        // }

        // String result = postObj.createPost(db, post);
        // System.out.println(result);
        // }

        Notification notification = new Notification();

        notification.sendGmail();
        notification.sendHotmail();
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
