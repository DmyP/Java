package Quiz.a7_polymorph.asd;

import Quiz.a6_oop.FIO;

public class Owner {
    private FIO fio;

    public Owner(FIO fio) {
        this.fio = fio;
    }

    public String toString() {
        return fio.toString();
    }
}
