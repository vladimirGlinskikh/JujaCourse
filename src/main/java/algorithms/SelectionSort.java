package algorithms;

public class SelectionSort {
    // Меняет местами элементы в индексах i and j
    public static void swapElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Находит индекс с наименьшим значением,
     * начиная с индекса при запуске
     * и двигаясь к концу массива.
     */

    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    // сортирует элементы с помощью сортировки выбором
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 7, 1, 0, 78, 56, 76, 12};
        selectionSort(array);
        for (Integer number : array) {
            System.out.print(number + " ");
        }
    }
}
