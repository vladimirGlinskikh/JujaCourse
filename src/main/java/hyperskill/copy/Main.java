package hyperskill.copy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] source1 = new int[10];
        int[] buffer = new int[4];

        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println(" // Копируем из этого массива");

        System.arraycopy(source, 0, buffer, 0, 4);
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println(" // Наполняем буфер");

        System.arraycopy(buffer, 0, source1, 0, 4);
        for (int j = 0; j < source1.length; j++) {
            System.out.print(source1[j] + " ");
        }
        Arrays.fill(buffer, 0);
        System.out.println(" // Копируем из буфера во второй массив");

        System.arraycopy(source, 4, buffer, 0, 4);
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println(" // Копируем из первого массива вторую партию и наполняем буфер");

        System.arraycopy(buffer, 0, source1, 4, 4);
        for (int j = 0; j < source1.length; j++) {
            System.out.print(source1[j] + " ");
        }
        Arrays.fill(buffer, 0);
        System.out.println(" // Копируем из буфера и вставляем во второй массив");

        System.arraycopy(source, 8, buffer, 0, 2);
        for (int i = 0; i < buffer.length; i++) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println(" // Копируем из первого массива остатки роскоши в буфер");

        System.arraycopy(buffer, 0, source1, 8, 2);
        for (int j = 0; j < source1.length; j++) {
            System.out.print(source1[j] + " ");
        }
        Arrays.fill(buffer, 0);
        System.out.println(" // Копируем из буфера во второй массив остатки роскоши былой");

        System.out.println(" ");
        System.out.println("Конец задачи! :)");
    }
}
