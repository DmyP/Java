package Quiz.a6_oop;

public class Main {

    static String[] firstNames = new String[1000];
    static String[] secondNames = new String[1000];

    public static void main(String[] args) {
        int index = 56;

        firstNames[index] = "Stiven";
        secondNames[index] = "Pupkin";
//        setFio(index, "Stiven", "Pupkin");

        firstNames[index + 1] = "Ekaterina";
        secondNames[index + 1] = "Pupkina";
//        setFio(index, "Ekaterina", "Pupkina");
    }

//    static void setFio(int index, String firstName, String secondName) {
//        firstNames[index] = firstName;
//        secondNames[index] = secondName;
//    }
}
