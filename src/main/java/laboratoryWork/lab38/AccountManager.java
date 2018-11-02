package laboratoryWork.lab38;

public class AccountManager {
    public static boolean transfer(Account[] accounts,
                                   int[] delta) {
        int index = 0;
        while (index < accounts.length) {
            try {
                accounts[index].change(delta[index]);
            } catch (TryAgainException e) {
                continue;
            } catch (BlockAccountException e) {
                try {
                    for (int index1 = 0; index1 < index; index1++) {
                        accounts[index1].change(-delta[index1]);
                    }
                } catch (TryAgainException | BlockAccountException e1) {
                    //TODO code
                }
                return false;
            }
            index++;
        }
        return true;
    }
}
