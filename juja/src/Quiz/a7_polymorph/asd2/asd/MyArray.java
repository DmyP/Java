package Quiz.a7_polymorph.asd2.asd;

import java.util.Arrays;


public class MyArray {
    private Object[] data;

    public MyArray(int length) {
        data = new Object[length];
    }

    public MyArray(MyArray source) {
        data = new Object[source.data.length];
        for (int i = 0; i < source.data.length; i++) {
            data[i] = source.data[i];
        }
    }

    public MyArray() {
        data = new Object[0];
    }

    public Object get(int index) {
        return data[index];
    }

    public void set(int index, Object newValue) {
        data[index] = newValue;
    }

    public void remove(int index) {
        Object[] array2 = new Object[data.length - 1];
        for (int i = 0; i < index; i++) {
            array2[i] = data[i];
        }
        for (int i = index + 1; i < data.length; i++) {
            array2[i - 1] = data[i];
        }
        data = array2;
    }

    public void add(int index, Object newValue) {
        Object[] array2 = new Object[data.length + 1];
        for (int i = 0; i < index; i++) {
            array2[i] = data[i];
        }
        array2[index] = newValue;
        for (int i = index; i < data.length; i++) {
            array2[i + 1] = data[i];
        }
        data = array2;
    }

    public MyArray copy() {
        return new MyArray(this);
    }

    public int size() {
        return data.length;
    }

    public Object[] getArray() {
        return new MyArray(this).data;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public void add(Object newValue) {
        add(data.length, newValue);
    }
}
