import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int year = scanner.nextInt();
        boolean validator = (year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0);
        if (validator) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");        }
    }
}