package fourtySixTasks.one;

class Two extends One {
    public int a = 20;

    @Override
    public void abc() {
        System.out.println("child non-static");
    }

    public static void abc2() {
        System.out.println("child static");
    }

    public static void main(String[] args) {
        Two two = new Two();
        System.out.println(two.a);
        System.out.println(((One) two).a);
        two.abc();
        ((One) two).abc();
        two.abc2();
        ((One) two).abc2();

    }
}

class One {
    public int a = 10;

    public void abc() {
        System.out.println("base non-static");
    }

    public static void abc2() {
        System.out.println("base static");
    }
}
