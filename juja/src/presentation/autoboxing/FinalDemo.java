package presentation.autoboxing;


public class FinalDemo {

    private static final int finalStaticField;

    static {
        finalStaticField = 1;
    }

    private int finalField;

    public FinalDemo() {
        finalField = 3;
    }

    public static final void finalMethod(final int finalParameter) {
//        finalParameter = 3;
        new Runnable() {
            @Override
            public void run() {
                System.out.println(finalParameter);
            }
        };
    }

}


//class FinalDemoSubclass extends FinalDemo{
//
//    public void finalMethod(int finalParameter) {
//
//    }
//}
