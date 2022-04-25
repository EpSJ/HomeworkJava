package org.EPsJ;

public class DayTime {
    public static void main(String[] args) {
        var currentTime = 23;
        if (currentTime >= 5 && currentTime < 12 ) {
            System.out.println("Утро");
        }
        if (currentTime >=12 && currentTime < 16) {
            System.out.println("День");
        }
        if (currentTime >= 16 && currentTime < 24) {
            System.out.println("Вечер");
        }
        if (currentTime >= 0  && currentTime < 5) {
            System.out.println("Ночь");
        }
    }
}
