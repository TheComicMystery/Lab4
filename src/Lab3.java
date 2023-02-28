public class Lab3 {
    public static void Lab3(String[] args) {
        //Box parameters
        int x = 5;
        int y = 20;
        int z = 15;
        //Container parameters
        int a = 10;
        int b = 20;
        int c = 30;
        //Comparing them
        if (x <= a && y <= b && z <= c) {
            System.out.println("The box can fit inside the container.");
        } else {
            System.out.println("The box cannot fit inside the container.");
        }
    }
}