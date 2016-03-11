package week4.lab27PrintN;

public class Library {

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
    String s = "";
        for (int i = 0; i < catalog.length; i++) {

            if (catalog[i].getCountPages() > barrierCountPages) {
                s += catalog[i].toPrint();
            }
        }
        return s;
    }

}
