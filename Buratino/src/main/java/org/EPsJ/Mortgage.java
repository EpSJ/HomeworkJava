package org.EPsJ;

public class Mortgage {
    public static void main(String[] args) {
        double mortgageSum = 2_999_999;
        double prfromfirstPayment = 0.2;
        var firstPayment = mortgageSum * prfromfirstPayment;
        System.out.println("Первый взнос по ипотеке равен = " + firstPayment);
    }
}
