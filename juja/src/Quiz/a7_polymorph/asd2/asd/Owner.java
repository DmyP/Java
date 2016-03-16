package Quiz.a7_polymorph.asd2.asd;

import Quiz.a6_oop.FIO;

/**
 * Created by indigo on 31.07.2015.
 */
public class Owner {
    private FIO fio;

    public Owner(FIO fio) {
        this.fio = fio;
    }

    public String toString() {
        return fio.toString();
    }
}
