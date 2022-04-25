package org.EPsJ;

public class IdealWeight {
    public static void main(String[] args) {
        final double height = 160;
        final double weight =  57;
        final double calculation = (height - 100) * (1 - 0.10);
        System.out.println(calculation);
        if (calculation - 5  <= weight && calculation  + 5 >= weight) {
            System.out.println("Вес идеален");
        } else {
            System.out.println("Вес не идеален");
        }
    }
}
