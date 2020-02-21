package fourtySixTasks.two;

class One {
    public One() {
        stringOne = abc("StringOne");
    }

    static String stringOne = abc("StringTwo");
    String stringThree = abc("StringThree");

    {
        stringOne = abc("StringFour");
    }

    static {
        stringOne = abc("StringFive");
    }

    static String stringTwo = abc("StringSix");
    String stringFour = abc("StringSeven");

    public static void main(String[] args) {
        One one = new One();
    }

    static String abc(String string) {
        System.out.println(string);
        return string;
    }
}
