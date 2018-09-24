package laboratoryWork.lab25;

public class Test {
    public static void main(String[] args) {
        Journal journal = new Journal("myJournal", 100, "2018", "31");
        System.out.println(journal.toPrint());
    }
}
