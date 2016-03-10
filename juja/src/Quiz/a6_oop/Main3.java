package Quiz.a6_oop;

public class Main3 {

    static FIO[] fios = new FIO[10000];

    public static void main(String[] args) {
        for (int i = 0; i < fios.length; i++) {
            fios[i] = new FIO();
        }

        int index = 56;

        FIO fio1 = fios[index];
        fio1.setFirstName("Stiven");
        fio1.setSecondName("Pupkin");

        FIO fio2 = fios[index + 1];
        fio2.set("Ekaterina", "Pupkina");

        System.out.println(fio2.toString());
        System.out.println(fios[56].toString());
    }
}
