package anotherExperiments.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SimpleArrayListCapacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(i);
        }
        System.out.println(getCapacity(arrayList));

    }

    public static int getCapacity(ArrayList<?> al) throws NoSuchFieldException, IllegalAccessException {
        Field dateField = ArrayList.class.getDeclaredField("elementData");
        dateField.setAccessible(true);

        return ((Object[]) dateField.get(al)).length;
    }
}
