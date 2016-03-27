package week7.lab41SimlpeLinkedList;

/*
Интерфейс SimpleList < E > - это упрощенная версия java.util.List.
В классе SimpleLinkedList < E > уже реализована большая часть методов интерфейса SimpleList < E > . Необходимо закончить реализацию SimpleList < E > и переопределить следующие методы класса SimpleLinkedList < E >:
1) public Iterator iterator() - метод возвращает экземпляр класса, который реализовует стандартный интерфейс Iterator < E > из SDK . При попытке удалить элемент итератора до вызова метода next() - кидать java.lang.IllegalArgumentException
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
2) public String toString() - метод, который возвращает строку которая является конкатенацией всех элементов коллекции. Ожидается следующий формат "[1, 2, 3, 4, 5]", "[]" - для пустого списка.
3) public boolean equals(Object o) - позволяет сравнить с другим  экземпляром класса.
4) public int hashCode() - метод возвращает хеш-код. Хеш код должен соответствовать следующим правилам: Одинаковые экземпляры класса должны иметь одинаковый хеш-код. Разные экземпляры класса имеют разный хеш-код (минимизировать вероятность возникновения коллизии).
 */

import java.util.Iterator;

public class SimpleLinkedList <E> implements SimpleList<E> {
    private Node<E> first = null; // head
    private Node<E> last = null; // tail
    private int size = 0;

    private static class Node<T> {
        private Node <T> prev;
        private T item;
        private Node <T> next;

        private Node(Node<T> prev, T item, Node<T> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    private Node<E> node(int index) {
        if (index < size / 2) {
            Node<E> tmp = first;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }
    private E unlink(Node<E> x) { //todo:
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public boolean add(E newElement) {
        final Node<E> tmp = last;
        final Node<E> newNode = new Node<>(tmp, newElement, null);
        last = newNode;
        if (tmp == null) {
            first = newNode;
        } else {
            tmp.next = newNode;
        }
        size++;
        return true;
    }
    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
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
        checkIndex(index);
        return unlink(node(index));
    }

/*BODY*/
}

interface SimpleList<T> {
    public boolean add(T newElement);
    public T get(int index);
    public Iterator<T> iterator();
    public int size();
    public boolean isEmpty();
    public T remove(int index);
}