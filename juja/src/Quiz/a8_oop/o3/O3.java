package Quiz.a8_oop.o3;

public class O3 {
}

class ParentMessage {
    String call = "Parent";
}
class ChildMessage extends ParentMessage {
    String call = "Child";
}
class Test {
    public static void main(String[] args) {
        send(new ChildMessage());
    }
    public static void send(ParentMessage msg) {
        System.out.println(msg.call);
    }
}
