package Quiz.a9.pack4;

public class FirstLetterComparator implements Comparator {

    @Override
    public boolean compare(Object o1, Object o2) {
        return o1.toString().charAt(0) > o2.toString().charAt(0);
    }
}
