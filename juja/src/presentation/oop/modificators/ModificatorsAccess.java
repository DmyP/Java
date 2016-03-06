package presentation.oop.modificators;

import presentation.oop.ModificatorsDemo;

public class ModificatorsAccess {
    public static void main(String[] args) {
        ModificatorsDemo modificators = new ModificatorsDemo();

        //access to public
        int i = modificators.publicField;
        modificators.publicMethod();

        //access to protected
//        i = modificators.protectedField;
//        modificators.protectedMethod();

        //access to package-private
//        i = modificators.packagePrivateField;
//        modificators.packagePrivateMethod();

        //access to private
//        i = modificators.privateField;
//        modificators.privateMethod();
    }
}

