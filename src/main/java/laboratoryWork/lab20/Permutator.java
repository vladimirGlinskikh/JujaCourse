package laboratoryWork.lab20;

import java.util.Arrays;
public class Permutator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
    }

    public static void permutation(int[] list, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(list));
        } else {
            for (int k = 0; k < size; k++) {
                swap(list, k, size - 1);
                permutation(list, size - 1);
                swap(list, k, size - 1);
            }
        }
    }

    private static void swap(int[] arr, int index0, int index1) {
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
