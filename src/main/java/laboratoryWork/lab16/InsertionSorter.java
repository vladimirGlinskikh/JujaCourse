package laboratoryWork.lab16;

import java.util.Arrays;

public class InsertionSorter {
    public static void main(String[] args) {
        int[] ints = {5, 9, 1, 0, 2, 3};
        System.out.println(Arrays.toString(ints));
        sort(ints);
    }

    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
