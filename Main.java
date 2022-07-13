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

}
