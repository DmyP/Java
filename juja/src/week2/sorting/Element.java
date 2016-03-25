package week2.sorting;

public class Element<T extends Comparable> {
    private T data;
    private int id;

    public Element(int id, T data) {
        this.data = data;
        this.id = id;
    }

    public String toString() {
        return String.format("[I%s=%s]", id, data);
    }

    public Element(Element<T> element) {
        this.data = element.data;
        this.id = element.id;
    }

    public T getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Element)) {
            return false;
        }

        Element e = (Element)obj;
        return id == e.id && data.equals(e.data);
    }

    public int compareTo(Element<Comparable> e) {
        return this.getData().compareTo(e.getData());
    }
}
