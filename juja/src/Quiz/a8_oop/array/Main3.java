package Quiz.a8_oop.array;

public class Main3 {
     int num = 0;
    public static void main(String[] args) {

        Main3 m = new Main3();
        System.out.println(m.print("10"));
        System.out.println(m.print(m.num + "1"));
    }
    public int print (String num){
        this.num = Integer.parseInt(num);
        return this.num;
    }}
