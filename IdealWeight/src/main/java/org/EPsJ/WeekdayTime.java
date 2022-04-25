package org.EPsJ;

public class WeekdayTime {
    public static void main(String[] args) {
        var currentTime = 21;
        var currentDay = 6;
        var weekday = currentDay <= 5;
        var weekend = currentDay > 5;
        if (currentTime >= 0 && currentTime < 5 && weekday) {
            System.out.println("А ну ка спать!");
        }
        if (currentTime >= 5 && currentTime < 8 && weekday) {
            System.out.println("Доброе утро!");
        }
        if (currentTime >= 8 && currentTime < 11 && weekday) {
            System.out.println("Всё пропало ты проспал!");
        }
        if (currentTime >= 11 && weekday) {
            System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул!");
        }
        if (currentTime >= 5 && currentTime < 12 && weekend) {
            System.out.println("Доброе утро!");
        }
        if (currentTime > 12 && currentTime < 18 && weekend) {
            System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
        }
        if (currentTime >= 18 && weekend) {
            System.out.println("Дааа, с режимом нужно что-то делать!");
        }
    }
}

