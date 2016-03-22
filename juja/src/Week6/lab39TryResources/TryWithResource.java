package week6.lab39TryResources;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
        AutoCloseable resourceA = null;
        AutoCloseable resourceB = null;
        try {
            resourceA = factoryA.create();
            resourceB = factoryB.create();
            body.runBody();
            try {
                resourceB.close();
            } catch (Throwable closeEx) {
            }
            try {
                resourceA.close();
            } catch (Throwable closeEx) {
            }
        } catch (Throwable bodyEx) {
            try {
                resourceB.close();
            } catch (Throwable closeEx) {
                bodyEx.addSuppressed(closeEx);
            }
            try {
                resourceA.close();
            } catch (Throwable closeEx) {
                bodyEx.addSuppressed(closeEx);
            }
        }

    }


}




interface AutoCloseableFactory {
    public AutoCloseable create() throws Throwable;
}

interface TryBody {
    public void runBody() throws Throwable;
}
