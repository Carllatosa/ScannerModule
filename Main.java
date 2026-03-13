import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, course, birthday, hometown, status, profession;

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.println("Enter your course: ");
        course = input.nextLine();
        System.out.println("Enter your birthday: ");
        birthday = input.nextLine();
        System.out.println("Enter your hometown: ");
        hometown = input.nextLine();
        System.out.println("Enter your status (Single/Married/Delulu): ");
        status = input.nextLine();
        System.out.println("Enter your profession: ");
        profession = input.nextLine();

        System.out.println("Welcome, " + name + "\nWelcome to Programming "
 + course + "NCIII!" + "\nWe will be recording you as our birthday month celebrant." +
                "\nYour birthday is " + birthday + "\nHere are some of your personal information" +
                "\n Hometown : " + hometown + "\n Status : " + status + "\n Profession : "
        + profession);

    }
}