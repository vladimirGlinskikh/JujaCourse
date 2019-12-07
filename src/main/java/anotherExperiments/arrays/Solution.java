package anotherExperiments.arrays;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j;

        int[] array = new int[15];
        int chet = 0;
        int nechet = 0;
        for (int i = 0; i < array.length; i++) {
            j = s.nextInt();
            if (j % 2 == 0)
                chet += i;
            else
                nechet += i;
        }
        if (chet > nechet) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
