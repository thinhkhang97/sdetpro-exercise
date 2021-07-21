package exercises;

// Sort array
public class ArrayEx3 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 10, 2, 4, 8, 10, 8, 5, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("The array after sorting: ");
        // Show sort array
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
