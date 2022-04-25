package org.EPsJ;

    public class SimpleNumbers {
        public static void main(String[] args) {
            int superNumber = 7;
            for (int i = 2; i < superNumber; i++) {
                if (superNumber % i == 0) {
                    System.out.println(superNumber + " не простое число");
                    return;
                }
            }
            System.out.println(superNumber + " простое число");
        }
    }
