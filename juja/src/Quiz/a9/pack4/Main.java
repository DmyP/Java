package Quiz.a9.pack4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Comparator comparator = new ToStringComparator();
//        [3, 6, 45, 123, 456, 12345]
//        [d, y, ds, dsds, sdseee, sekfhseflj]
//        [true, true, true, false]

//        Comparator comparator = new FirstLetterComparator();
//        [123, 12345, 3, 45, 456, 6]
//        [ds, d, dsds, sekfhseflj, sdseee, y]
//        [false, true, true, true]

        BubleSorter sorter = new BubleSorter(comparator);

        System.out.println(Arrays.toString(sorter.sort(new Integer[]{123, 45, 3, 6, 12345, 456})));
        System.out.println(Arrays.toString(sorter.sort(new String[]{"sekfhseflj", "ds", "sdseee", "d", "dsds", "y"})));
        System.out.println(Arrays.toString(sorter.sort(new Boolean[]{true, true, false, true})));
    }
}
