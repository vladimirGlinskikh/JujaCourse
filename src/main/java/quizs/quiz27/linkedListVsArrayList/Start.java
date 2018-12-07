package quizs.quiz27.linkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Start {
    private static final int COUNT = 1_000;
    private static final int ELEMENTS = 1_000_000;
    private static final Integer ELEMENT = -1;
    private static final int ITERATIONS = 10;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(ELEMENTS * 2);
        testList(arrayList);

        List<Integer> linkedList = new LinkedList<>();
        testList(linkedList);
    }

    static void testList(List<Integer> list) {
        long meansBegin = 0;
        long meansMiddle = 0;
        long meansEnd = 0;
        long start;
        long end;

        for (int i = 0; i < ITERATIONS; i++) {
            list.clear();
            fillList(list);
            start = System.currentTimeMillis();
            insertBegin(list);
            end = System.currentTimeMillis();
            meansBegin = meansBegin + (end - start);
            System.out.println(list.getClass().getName() + ", beginning: " + (end - start));

            list.clear();
            fillList(list);
            start = System.currentTimeMillis();
            insertMiddle(list);
            end = System.currentTimeMillis();
            meansMiddle += end - start;
            System.out.println(list.getClass().getName() + ", middle: " + (end - start));

            list.clear();
            fillList(list);
            start = System.currentTimeMillis();
            insertEnd(list);
            end = System.currentTimeMillis();
            meansEnd += end - start;
            System.out.println(list.getClass().getName() + ", end: " + (end - start));
        }
        System.out.println(list.getClass().getName() +
                " mean times: beginning = " + (meansBegin / 10L) +
                ", middle = " + (meansMiddle / 10L) +
                ", end = " + (meansEnd / 10L));
    }

    static void insertEnd(List<Integer> list) {
        int position = (list.size() / 10) * 9;
        for (int i = 0; i < COUNT; i++) {
            list.add(position, ELEMENT);
        }
    }

    static void insertMiddle(List<Integer> list) {
        int position = list.size() / 2;
        for (int i = 0; i < COUNT; i++) {
            list.add(position, ELEMENT);
        }
    }

    static void insertBegin(List<Integer> list) {
        int position = list.size() / 10;
        for (int i = 0; i < COUNT; i++) {
            list.add(position, ELEMENT);
        }
    }

    static void fillList(List<Integer> list) {
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
    }
}
