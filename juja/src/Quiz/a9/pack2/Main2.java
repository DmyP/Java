package ua.com.juja.a9.pack2;

/**
 * Created by indigo on 10.08.2015.
 */
public class Main2 {

    public static void main(String[] args) {
//        Asd lock = new AsdImpl("[1, 2, 3, 36, 4, 5, 6]");
        Lock lock = new WeakLock("[1, 2, 3, 36, 4, 5, 6]");

        Key oneKey = new SecureIronBilletKey(new int[]{1, 2, 3}, new int[] {4, 5, 6});

        Key anotherKey = new ClassicIronBilletKey(2, 4, 5, 2, 7, 3, 1);

        test(lock, oneKey, anotherKey);

        Key thirdKey = new PinchBar();

        test(lock, oneKey, thirdKey);

    }

    private static void test(Lock lock, Key oneKey, Key anotherKey) {
        System.out.println("My door is: " + lock.isOpened()); // true

        lock.unlock(oneKey);

        System.out.println("Close my door, so:" + lock.isOpened()); // false

        lock.unlock(anotherKey);

        System.out.println("Thief try to open door, so:" + lock.isOpened()); // false

        lock.unlock(oneKey);

        System.out.println("Open my door with valid key, so:" + lock.isOpened()); // true
    }
}
