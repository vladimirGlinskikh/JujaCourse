package laboratoryWork.lab39;

public interface AutoCloseableFactory {
    AutoCloseable create() throws Throwable;
}
