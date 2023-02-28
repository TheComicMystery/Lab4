import java.util.Scanner;

public class Lab6 {
    public static void Lab6(String[] args) {
        int A = 10;
        int B = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation from 1 to 4: ");
        int N = scanner.nextInt();
        switch (N) {
            case 1:
                System.out.println(A + B);
                break;
            case 2:
                System.out.println(A - B);
                break;
            case 3:
                System.out.println(A * B);
                break;
            case 4:
                System.out.println(A / B);
                break;

            default:
                System.out.println("Wrong operation, select from 1 to 4");
        }
    }
}