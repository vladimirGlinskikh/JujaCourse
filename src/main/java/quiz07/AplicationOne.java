package quiz07;

public class AplicationOne {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        invert(arr);
    }

    public static void invert(int[] arr) {
        for (int k = 0; k < arr.length / 2; k++) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }
        System.out.println(arr);
    }
}
