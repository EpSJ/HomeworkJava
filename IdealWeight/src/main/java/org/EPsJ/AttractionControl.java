package org.EPsJ;

public class AttractionControl {
    public static void main(String[] args) {
        int kidYears = 12;
        int kidHeight = 140;
        boolean parentExist = true;
        if (parentExist || kidYears >= 15 && kidHeight >=160) {
            System.out.println("Тебе можно прокатиться");
        } else {
            System.out.println("Тебе нельзя прокатиться");
        }
    }
}
