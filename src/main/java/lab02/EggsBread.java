package lab02;

public class EggsBread {
    public static void main(String[] args) {
        String emptyPurchases = EggsBread.printPurchases(false, false);

        if (emptyPurchases == null) {
            throw new AssertionError("Result cannot be null");
        }
        if (emptyPurchases.isEmpty())
            System.out.print("OK");
    }

    public static String printPurchases(boolean hasEggs, boolean hasBread) {

        if (hasEggs && hasBread == true) {
            return "eggs,bread";
        } else if (!hasEggs && hasBread == true) {
            return "bread";
        } else if (hasEggs && hasBread == false) {
            return "eggs";
        } else return "";
    }
}
