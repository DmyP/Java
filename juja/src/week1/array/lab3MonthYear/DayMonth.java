package week1.array.lab3MonthYear;
/*
Реализовать функцию, которая по порядковому номеру вернет текстовый вариант на английском языке
getMonthOfYear(1) = "january"
getMonthOfYear(2) = "february"
....
getMonthOfYear(12) = "december"

Если на вход подается число вне диапазона 1-12 - вернуть пустую строку.
Для того, чтобы метод вернул значение, воспользуйтесь ключевым словом return Например, return "september";
*/
public class DayMonth {
        public static void main(String[] args) {
            String str = getMonthOfYear(1);
            System.out.println(str);
        }

        public static String getMonthOfYear(int number) {
            String month = "";
            switch (number) {
                case 1:  month = "January";
                    break;
                case 2:  month = "February";
                    break;
                case 3:  month = "March";
                    break;
                case 4:  month = "April";
                    break;
                case 5:  month = "May";
                    break;
                case 6:  month = "June";
                    break;
                case 7:  month = "July";
                    break;
                case 8:  month = "August";
                    break;
                case 9:  month = "September";
                    break;
                case 10: month = "October";
                    break;
                case 11: month = "November";
                    break;
                case 12: month = "December";
                    break;

            }
            return month;
        }

}


