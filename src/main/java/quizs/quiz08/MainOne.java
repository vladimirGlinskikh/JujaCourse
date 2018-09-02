package quizs.quiz08;

public class MainOne {
    public static void main(String[] args) {
        int[] ints = new int[7];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;
        ints[5] = 6;
        ints[6] = 7;
        fun(ints);
        System.out.println("OneNumber: " + ints[0]);
        System.out.println("TwoNumber: " + ints[1]);
        System.out.println("ThreeNumber: " + ints[2]);
        System.out.println("FourNumber: " + ints[3]);
        System.out.println("FiveNumber: " + ints[4]);
        System.out.println("SixNumber: " + ints[5]);
        System.out.println("SevenNumber: " + ints[6]);
    }

    public static void fun(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] > data[data.length - 1]) {
                swap(data, k, data.length - 1);
            }
        }
    }

    public static void swap(int[] data, int k, int i) {
        int tmp = data[k];
        data[k] = data[i];
        data[i] = tmp;
    }
}
