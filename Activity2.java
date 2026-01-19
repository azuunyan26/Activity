import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Middle Initial: ");
        char middleInitial = sc.next().charAt(0); // get first character

        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.println("\n--- Personal Information ---");
        System.out.println("Full Name: " + firstName + " " + middleInitial + ". " + lastName);
        System.out.println("Age: " + age + " years old");

        sc.close();
    }
}
