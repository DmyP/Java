package presentation.enumerated;

import java.util.Arrays;

import static presentation.enumerated.EnumDemo.Seasons.AUTUMN;

public class EnumDemo {
    public static void main(String[] args) {
        Seasons season = AUTUMN;
        System.out.println(season.name());
        System.out.println(season.ordinal());
        System.out.println(Arrays.toString(Seasons.values()));
        Seasons summer = Seasons.valueOf("SUMMER");
        System.out.println(summer);
        System.out.println(summer.getClass().getSuperclass().getName());
    }

    enum Seasons {
        WINTER, SPRING, SUMMER, AUTUMN
    }
}
