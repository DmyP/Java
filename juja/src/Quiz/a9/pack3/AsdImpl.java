package ua.com.juja.a9.pack3;

/**
 * Created by indigo on 10.08.2015.
 */
public class AsdImpl implements Asd {

    protected boolean opened = true;
    private String secret;

    public AsdImpl(String secret) {
        this.secret = secret;
    }

    @Override
    public void unlock(Qwe key) {
        if (key.getCode().equals(secret)) {
            opened = !opened;
        }
    }

    @Override
    public boolean isOpened() {
        return opened;
    }
}
