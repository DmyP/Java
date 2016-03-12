package week4.test2;

public class App {
    public static void main(String[] args) {
        Holder ref = new Holder(1);
        System.out.print(f(f(f(ref))).field);
    }
    public static Holder f(Holder arg) {
        arg.field = arg.field + 1;
        arg = new Holder(arg.field + 1);
        return arg;
    }
}
 class Holder {
    public int field;
    public Holder(int field) {
        this.field = field;
    }
}