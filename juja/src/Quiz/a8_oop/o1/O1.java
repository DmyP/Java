package Quiz.a8_oop.o1;;

public class O1 {

}

class ParentMessage {
    void call() {
        System.out.println("Parent");
    }
}

class ChildMessage extends ParentMessage {
    void call() {
        System.out.println("Child");
    }
}

//class Child2Message extends ParentMessage {
//    void call() {
//        System.out.println("Child2");
//    }
//}
//
//class Child3Message extends ParentMessage {
//    void call() {
//        System.out.println("Child3");
//    }
//}

class Test {
    public static void main(String[] args) {
        send(new ChildMessage());
    }
    public static void send(ParentMessage msg) {
        msg.call();
    }
}
