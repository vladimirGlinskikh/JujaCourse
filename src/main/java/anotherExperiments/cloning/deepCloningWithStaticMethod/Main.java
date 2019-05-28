package anotherExperiments.cloning.deepCloningWithStaticMethod;

public class Main {
    public static void main(String[] args) {
        Human cloneHuman = Human.getHumanInstanceWithAgeAndString(20, "Andrey");
        System.out.println(cloneHuman);
    }
}
