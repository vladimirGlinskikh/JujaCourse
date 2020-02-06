package algorithms;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List<String> list;

    public ListClientExample() {
        list = new LinkedList();
    }

    public List<String> getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample listClientExample = new ListClientExample();
        List list = listClientExample.getList();
        System.out.println(list);
    }
}
