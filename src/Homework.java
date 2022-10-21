import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + 2);
         }
        else {
            System.out.println(number +1);
        }
        System.out.println();

        System.out.println("Task 2");

        int speed = scanner.nextInt();
        int time = scanner.nextInt();
        int sizeOfPath = scanner.nextInt();

        int firstPart = speed * time;
        int secondPath = sizeOfPath - firstPart;

        if (firstPart > secondPath) {
            System.out.println("Closer to Sherlock");
        }
        if (firstPart < secondPath) {
            System.out.println("Closer to John");
        }
        if (firstPart == secondPath) {
            System.out.println("Same");
        }
        System.out.println();
        System.out.println("End of Homework");



    }
}