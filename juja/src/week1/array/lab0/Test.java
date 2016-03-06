package week1.array.lab0;

public class Test {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0, t = 0;
        if ((x++ != 0 && y++ != 0) & (z++ != 0 & t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

        x = 0;
        y = 0;
        z = 0;
        t = 0;
        if ((x++ != 0 & y++ != 0) & (z++ != 0 && t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

        x = 0;
        y = 0;
        z = 0;
        t = 0;
        if ((x++ != 0 & y++ != 0) & (z++ != 0 & t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

        x = 0;
        y = 0;
        z = 0;
        t = 0;
        if ((x++ != 0 && y++ != 0) & (z++ != 0 && t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

        int x1 = -14 & 7;
        ;
        System.out.println(x1);


        x = 0;
        y = 0;
        z = 0;
        t = 0;
        if ((x++ != 0 | y++ != 0) || (z++ != 0 | t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

        x = 0;
        y = 0;
        z = 0;
        t = 0;
        if ((x++ != 0 || y++ != 0) | (z++ != 0 || t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

        x = 0;
        y = 0;
        z = 0;
        t = 0;
        if ((x++ != 0 | y++ != 0) | (z++ != 0 | t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

        x = 0;
        y = 0;
        z = 0;
        t = 0;
        if ((x++ != 0 || y++ != 0) || (z++ != 0 || t++ != 0)) {/*NOP*/}
        System.out.println(x + "" + y + "" + z + "" + t);

    }


}
