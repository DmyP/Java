package Quiz.a8_oop.array;

import java.util.Arrays;

/**
 * Created by indigo on 07.08.2015.
 */
// SOLID
// RCSSI
// PPPPP

// Single Responsibility Principle
public class MyArray {
    private int[] data;

    public MyArray(int length) {
        data = new int[length];
    }

    public MyArray(MyArray source) {
        data = new int[source.data.length];
        for (int i = 0; i < source.data.length; i++) {
            data[i] = source.data[i];
        }
    }

    public MyArray() {
        data = new int[0];
    }

//    public MyArray(int[] source) {
//        data = new int[source.length];
//        for (int i = 0; i < source.length; i++) {
//            data[i] = source[i];
//        }
//    }

    public int get(int index) {
        return data[index];
    }

    public void change(int index, int newValue) {
        data[index] = newValue;
    }

    public void remove(int index) {
        int[] array2 = new int[data.length - 1];
        for (int i = 0; i < index; i++) {
            array2[i] = data[i];
        }
        for (int i = index + 1; i < data.length; i++) {
            array2[i - 1] = data[i];
        }
        data = array2;
    }

    public void add(int index, int newValue) {
        int[] array2 = new int[data.length + 1];
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

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public void add(int newValue) {
        add(data.length, newValue);
    }
}
