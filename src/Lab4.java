import java.util.Scanner;

public class Lab4 {
    public static void Lab4(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        System.out.println("What is the capital of the Great Britain?");
        String answer1 = input.nextLine();

        System.out.println("What is the capital of France?");
        String answer2 = input.nextLine();

        System.out.println("What is the capital of Germany?");
        String answer3 = input.nextLine();

        System.out.println("What is the capital of Poland?");
        String answer4 = input.nextLine();

        System.out.println("What is the capital of Ukraine?");
        String answer5 = input.nextLine();


        if (answer1.equalsIgnoreCase("London")) {
            score++;
        }

        if (answer2.equalsIgnoreCase("Paris")) {
            score++;
        }

        if (answer3.equalsIgnoreCase("Berlin")) {
            score++;
        }

        if (answer4.equalsIgnoreCase("Warsaw")) {
            score++;
        }

        if (answer5.equalsIgnoreCase("Kiev")) {
            score++;
        }

        System.out.println("Your score is " + score);
    }
}