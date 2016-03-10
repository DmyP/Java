package Quiz.a7_polymorph.asd;

import Quiz.a6_oop.FIO;

public class Main extends Object {
    public static void main(String[] args) {
        MultiHouse multiHouse = new MultiHouse(2);
//        Floor floor = multiHouse.get(10);
//        System.out.println(floor.toString());

        Owner owner1 = new Owner(new FIO("Stiven", "Pupkin"));
        Owner owner2 = new Owner(new FIO("Katerina", "Pupkina"));
        Owner owner3 = new Owner(new FIO("Elizavetta", "Pupkina"));
        Owner owner4 = new Owner(new FIO("Adam", "Pupkin"));
        Owner owner5 = new Owner(new FIO("Bob", "Marley"));

        Owner[] owners = new Owner[5];
        owners[0] = owner1;
        owners[1] = owner2;
        owners[2] = owner3;
        owners[3] = owner4;
        owners[4] = owner5;

        multiHouse.settle(owners);

        System.out.println(multiHouse.toString());

        multiHouse = null;
        owner1 = null;
    }
}
