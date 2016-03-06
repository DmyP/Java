package week1.array.lab4DayWeek;
/*
Реализовать функцию, которая по порядковому номеру дня в неделе возвращает его название на английском языке
getDayOfTheWeek(1) = "Monday"
getDayOfTheWeek(2) = "Tuesday"
....
getMonthOfWeek(7) = "Sunday"
Если приходит значение вне диапазона 1-7 то возвращать пустую строку.
Для того, чтобы метод вернул значение - воспользуйтесь ключевым словом return Например, return "wednesday";
Регистр не имеет значения
*/
public class DayWeek {
    public static void main(String[] args) {
        String str = getDayOfTheWeek(1);
        System.out.println(str);
    }
    public static String getDayOfTheWeek(int dayNum) {
        String day = "";
        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
        }
        return day;
    }
}

