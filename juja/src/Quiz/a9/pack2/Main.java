package Quiz.a9.pack2;

public class Main {

    public static void main(String[] args) {
        Lock lock = new LockImpl("[1, 2, 3, 4, 5, 6, 7]");

        Key oneKey = new ClassicIronBilletKey(1, 2, 3, 4, 5, 6, 7);
        Key anotherKey = new ClassicIronBilletKey(2, 4, 5, 2, 7, 3, 1);

        test(lock, oneKey, anotherKey);

    }

    private static void test(Lock lock, Key oneKey, Key anotherKey) {
        System.out.println(lock.isOpened()); // true

        lock.unlock(oneKey);

        System.out.println(lock.isOpened()); // false

        lock.unlock(anotherKey);

        System.out.println(lock.isOpened()); // false

        lock.unlock(oneKey);

        System.out.println(lock.isOpened()); // true
    }
}
