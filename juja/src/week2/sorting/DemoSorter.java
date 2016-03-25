
package week2.sorting;

import week2.sorting.algorithm.BubbleSorter;




public class DemoSorter extends BubbleSorter implements Sorter {

    private boolean brokenStable = false;
    private boolean brokenSorting = false;
    private boolean brokenElement = false;

    @Override
    public void sort(Array data) {
        super.sort(data);

        if (brokenStable) {
            brokenStable(data);
        }
        if (brokenSorting) {
            brokenSorting(data);
        }
        if (brokenElement) {
            brokenElement(data);
        }
    }

    public void enableBrokenStable() {
        brokenStable = true;
    }

    public void enableBrokenSorting() {
        brokenSorting = true;
    }

    public void enableBrokenElement() {
        brokenElement = true;
    }

    private void brokenElement(Array data) {
        data.set(0, -1);
    }

    private void brokenSorting(Array data) {
        data.swap(0, data.size() - 1);
    }

    private void brokenStable(Array data) {
        for (int i=0; i < data.size() - 1; i++) {
            if (data.get(i).compareTo(data.get(i+1)) == 0) {
                data.swap(i, i+1);
            }
        }
    }
}

