
import java.util.Scanner;

public class ScannerDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your score : ");
        Double score = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + score);
    }
}


