package week4.lab26PrintAll;

public class Library {

    public String printCatalog(Issue[] catalog) {
        String str = "";
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i] instanceof Issue) {
                str += catalog[i].toPrint();
            } else if (catalog[i] instanceof Book) {
                str += catalog[i].toPrint();
            } else if (catalog[i] instanceof Journal) {
                str += catalog[i].toPrint();
            }

        }
        return str;
    }

    public static void main(String[] args) {

    }
}

