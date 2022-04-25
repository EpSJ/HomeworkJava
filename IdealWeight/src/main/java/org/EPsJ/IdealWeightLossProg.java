package org.EPsJ;

public class IdealWeightLossProg {
    public static void main(String[] args) {
        final var baconKcal = 500;
        final var chocolatteKcal = 340;
        final var porridgeKcal = 250;
        final var limitKcal = 1400;
        final var todayEaten = 1150;
        final var kcalRemained = limitKcal - todayEaten;
        if (kcalRemained >= baconKcal) {
            System.out.println("Последний кусочек сала остался, налетай!");
        } else if (kcalRemained >= chocolatteKcal){
            System.out.println("Лови шоколадку!");
        } else if (kcalRemained >=porridgeKcal) {
            System.out.println("Кашу я бросать не буду, давай к столу!");
        } else {
            System.out.println("Наел сегодняшнюю норму, потерпишь до завтра!");
        }

    }
}
