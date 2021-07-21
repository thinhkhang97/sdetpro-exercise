package exercises;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] myArr = new int[]{10, 11, 22, 33, 44,10, 55};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please input a number (0 to exit the program!): ");
            int inputValue = scanner.nextInt();
            if (inputValue == 0) {
                System.out.println("Bye!");
                System.exit(1);
            }
            int count = 0;
            for (int elementIndex = 0; elementIndex < myArr.length; elementIndex++) {
                if(myArr[elementIndex] == inputValue) {
                    count++;
                }
            }
            if(count > 0) {
                System.out.printf("There are (is) %d number(s) %d in the array\n", count, inputValue);
            } else {
                System.out.println("Not found in the array!!!");
            }
        }
    }
}
