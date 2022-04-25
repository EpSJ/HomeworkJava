package org.EPsJ;

public class OfferSelection {
    public static void main(String[] args) {
        double firstHomeToOffice = 1;
        double secondHomeToOffice = 2.5;
        var workTime = 9;
        var firstPayment = 500;
        var secondPayment = 600;
        double firstPaymentPerHour = firstPayment / (workTime + firstHomeToOffice * 2);
        System.out.println(firstPaymentPerHour);
        double secondPaymentPerHour = secondPayment / (workTime + secondHomeToOffice * 2);
        System.out.println(secondPaymentPerHour);
        boolean bestOffer = firstPaymentPerHour > secondPaymentPerHour;
        if (bestOffer) {
            System.out.println("Выбирай первый");
        } else {
            System.out.println("Выбирай второй");
        }
    }
}
