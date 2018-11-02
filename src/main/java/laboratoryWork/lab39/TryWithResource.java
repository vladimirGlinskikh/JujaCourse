package laboratoryWork.lab39;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA,
                                   AutoCloseableFactory factoryB,
                                   TryBody body) throws Throwable {

        AutoCloseable closeableA = null;
        AutoCloseable closeableB = null;
        try {
            closeableA = factoryA.create();
            closeableB = factoryB.create();
            body.runBody();
        } catch (Throwable bodyEx) {
            if (closeableB != null) {
                try {
                    closeableB.close();
                } catch (Throwable closeEx) {
                    bodyEx.addSuppressed(closeEx);
                }
            }
            if (closeableA != null) {
                try {
                    closeableA.close();
                } catch (Throwable closeEx) {
                    bodyEx.addSuppressed(closeEx);
                }
            }
            throw bodyEx;
        }

        try {
            closeableB.close();
        } catch (Throwable e) {
            try {
                closeableA.close();
            } catch (Throwable ex) {
                e.addSuppressed(ex);
            }
            throw e;
        }
        closeableA.close();
    }
}
