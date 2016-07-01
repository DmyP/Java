package com.javarush.test.level34.lesson02.home01;

/* Рекурсия для мат.выражения
На вход подается строка - математическое выражение.
Выражение включает целые и дробные числа, скобки (), пробелы, знак отрицания -, возведение в степень ^, sin(x), cos(x), tan(x)
Для sin(x), cos(x), tan(x) выражение внутри скобок считать градусами, например, cos(3 + 19*3)=0.5
Степень задается так: a^(1+3) и так a^4, что эквивалентно a*a*a*a.
С помощью рекурсии вычислить выражение и количество математических операций. Вывести через пробел результат в консоль.
Результат выводить с точностью до двух знаков, для 0.33333 вывести 0.33, использовать стандартный принцип округления.
Не создавайте статические переменные и поля класса.
Не пишите косвенную рекурсию.
Пример, состоящий из операций sin * - + * +:
sin(2*(-5+1.5*4)+28)
Результат:
0.5 6
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.recursion("sin(2*(-5+1.5*4)+28)", 0); //expected output 0.5 6
    }

    public void recursion(final String expression, int countOperation) {
        //implement
        int from = expression.length() - 1;
        int to = 0;
        if (expression.charAt(from) == ')') {

            return recursion(expression.substring(to + 1, from - 1);

        } else {
            int pos = from;

            while (pos > to) {
                if (Character.isDigit(expression.charAt(pos))) {
                    pos--;
                } else {
                    int rightOperand = Integer.valueOf(expression.substring(pos + 1, from+1));
                    char operation = expression.charAt(pos);
                    int leftOperand = recursion(expression, pos - 1, to);

                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expression.substring(to, from + 1));
        }
    }

    public Solution() {
        //don't delete
    }
}
