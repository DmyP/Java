package ua.com.juja.a9.pack1;

/**
 * Created by indigo on 10.08.2015.
 */
public class MyClass2 implements Interface1, Interface2 {

    @Override
    public String getName() {
        return "Hello world form Interface1 implementation!";
    }

    @Override
    public int getInt() {
        return 546;
    }

    @Override
    public boolean getBoolean() {
        return false;
    }
}
