package week1.array.lab2printPurchases;
/*
Функция printPurchases принимает 2 логические параметра на вход - первый hasEggs второй - hasBread. Задание - на основе этих параметров вернуть строку со списком продуктов, которые купил програмист.
Например, если hasEggs == true && hasBread == true -> "Eggs,Bread"
Hint:
Чтобы склеить 2 строки следует пользоваться оператором +, Например String purchases = "Bread," + "Eggs";
Для того, чтобы метод вернул значение - используйте ключевое слово return Например, return "eggs";
(true, true) -> {"eggs,bread", "bread,eggs"} регистр не имеет значения
(false, true) -> {"bread"}
(true, false) -> {"eggs"}
(false, false) -> {""}
*/
public class EggsBread {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = true;
        System.out.println(printPurchases(bool1, bool2));
    }

    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        String s = "";
        if (hasEggs == true && hasBread == true){
            s="eggs,bread";
        }else if (hasEggs == false && hasBread == true){
            s= "bread";
        }else if (hasEggs == true && hasBread == false){
            s="eggs";
        }else if (hasEggs == false && hasBread == false){
            s="";
        }
        return s;
    }
}
