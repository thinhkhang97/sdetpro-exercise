package exercises;

import java.util.Scanner;

// Calculate average
public class ArrayEx2 {
    public static void main(String[] args) {
        final int MAX_ARR_LENGTH = 10;
        Scanner scanner = new Scanner(System.in);

        // This to keep where to put data and conditional if user input over 10 numbers
        int currentElementIndex = 0;
        double averageNum = 0.0;
        while (currentElementIndex < MAX_ARR_LENGTH) {
            System.out.println("Please input up to 10 numbers (0 to exit the program!): ");
            int inputValue = scanner.nextInt();
            if (inputValue == 0) {
                System.out.println("Calculating value....");
                System.exit(1);
            }
            // Calculate the average
            averageNum = (averageNum * currentElementIndex + inputValue) / (++currentElementIndex);
        }
        System.out.printf("You've reached the limit number, here is the average %f", averageNum);
    }
}
