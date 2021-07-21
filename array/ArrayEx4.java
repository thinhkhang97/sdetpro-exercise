package exercises;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 10, 2, 4, 8, 10, 8, 5};
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("The array after sorting: ");
        // Show sort array
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
