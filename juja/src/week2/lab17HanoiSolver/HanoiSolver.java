package week2.lab17HanoiSolver;

import java.util.Stack;

public class HanoiSolver {
    public static void main(String[] args) {
        int num = 30;
        Stack<Integer> from = new Stack<>();
        Stack<Integer> help = new Stack<>();
        Stack<Integer> to   = new Stack<>();
        for (int i = 0; i < num; i++) {
            from.push(i);
        }
        System.out.println(from);
        exchange(from, help, to, from.size());
        System.out.println(to);
    }

    private static void exchange(Stack<Integer> from, Stack<Integer> help, Stack<Integer> to, int count) {
        //System.out.println("from " + from + " help " + help + " to " + to);
        if (count > 0) {
            exchange(from, to, help, count - 1);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help, from, to, count - 1);
        }
    }
}
