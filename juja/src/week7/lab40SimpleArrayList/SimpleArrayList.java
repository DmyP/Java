package week7.lab40SimpleArrayList;
/*
Интерфейс SimpleList < E > - это упрощенная версия java.util.List.
В классе SimpleArrayList < E > уже реализована большая часть методов интерфейса SimpleList < E > . Необходимо
закончить реализацию SimpleList < E > и переопределить следующие методы класса SimpleArrayList < E >:
1) public Iterator iterator() - метод возвращает экземпляр класса, который реализовует стандартный интерфейс
Iterator < E > из SDK . При попытке удалить элемент итератора до вызова метода next() -
кидать java.lang.IllegalArgumentException
Код интерфейса:

public interface Iterator {
    boolean hasNext(); - метод возвращает true когда next() может вернуть элемент,
                         иначе - false.
    E next();          - метод возвращает следующий элемент, если элементов нету
                         NoSuchElementException
    void remove();     - метод удаляет последний возвращенный элемент, если итератор еще не возвращал
                         элемента еще нету - IllegalStateException
}
Или детальнее в SDK.
2) public String toString() - метод, который возвращает строку которая является конкатенацией всех элементов коллекции.
Ожидается следующий формат "[1, 2, 3, 4, 5]", "[]" - для пустого списка.
3) public boolean equals(Object o) - позволяет сравнить с другим  экземпляром класса.
4) public int hashCode() - метод возвращает хеш-код. Хеш код должен соответствовать следующим правилам: Одинаковые
экземпляры класса должны иметь одинаковый хеш-код. Разные экземпляры класса имеют разный хеш-код (минимизировать
вероятность возникновения коллизии).
 */
import java.util.Iterator;

public class SimpleArrayList <E> implements SimpleList<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public SimpleArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(E newElement) {
        ensureCapacity(size + 1);
        data[size] = newElement;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return data[index];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = data[index];
        int numMoved = size - index - 1;
        System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null;
        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }

    /*BODY*/

}

interface SimpleList<E> {
    public boolean add(E newElement);
    public E get(int index);
    public Iterator<E> iterator();
    public int size();
    public boolean isEmpty();
    public E remove(int index);
}
