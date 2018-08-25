package lab09;

public class ArrayFilter {

    public static void main(String[] args) {
        int[] a = new int[]{4, 3, 5, 6, 7, 9};
        int[] b = filterEven(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static int[] filterEven(int[] nums) {
        int[] number = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                number[j] = nums[i];
                j += 1;
            }
        }
        return number;
    }
}
