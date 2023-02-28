import java.util.Scanner;

public class Lab5 {
    public static void Lab5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ordinal number of the day of the week: ");
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("Monday: Algorithms and programming, Computer graphics");
                break;
            case 2:
                System.out.println("Tuesday: Algorithms and programming, Advanced mathematics, Data structures and algorithms");
                break;
            case 3:
                System.out.println("Wednesday: Data structures and algorithms, Algorithms and programming");
                break;
            case 4:
                System.out.println("Thursday: Physics, Physics, Computer graphics");
                break;
            case 5:
                System.out.println("Friday: Advanced mathematics, Data structures and algorithms, English");
                break;
            case 6:
                System.out.println("Saturday: Making labs");
                break;
            case 7:
                System.out.println("Sunday: Resting");
                break;

            default:
                System.out.println("Please enter a valid day number.");
        }
    }
}