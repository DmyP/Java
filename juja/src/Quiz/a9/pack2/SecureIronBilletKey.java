package Quiz.a9.pack2;

import java.util.Arrays;

public class SecureIronBilletKey extends IronBilletKey {

    private int[] notch1;
    private int[] notch2;

    public SecureIronBilletKey(int[] notch1, int[] notch2) {
        this.notch1 = notch1;
        this.notch2 = notch2;
    }

    @Override
    int[] getNotch() {
        int[] result = new int[notch1.length + notch2.length + 1];
        for (int index = 0; index < notch1.length; index++) {
            result[index] = notch1[index];
        }
        result[notch1.length] = 36;
        for (int index = 0; index < notch1.length; index++) {
            result[index + notch1.length + 1] = notch2[index];
        }

        return result;
    }

    @Override
    public String toString() {
        return "I am SecureIronBilletQwe with notch " +
                Arrays.toString(getNotch());
    }
}
