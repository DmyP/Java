package ua.com.juja.a9.pack2;

/**
 * Created by indigo on 10.08.2015.
 */
public interface Lock {

    void unlock(Key key);

    boolean isOpened();
}
