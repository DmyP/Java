package ua.com.juja.a9.pack2;

/**
 * Created by indigo on 10.08.2015.
 */
public class LockImpl implements Lock {

    protected boolean opened = true;
    private String secret;

    public LockImpl(String secret) {
        this.secret = secret;
    }

    @Override
    public void unlock(Key key) {
        if (key.getCode().equals(secret)) {
            opened = !opened;
        }
    }

    @Override
    public boolean isOpened() {
        return opened;
    }
}
