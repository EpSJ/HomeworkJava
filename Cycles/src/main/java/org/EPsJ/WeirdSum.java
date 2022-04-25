package org.EPsJ;

public class WeirdSum {
    public static void main(String[] args) {
        int sum = 0;
        int c = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i*c;
            c = -c;
        }
        System.out.println("Сумма = " + sum);
    }
}


// c = 1
// for (k = 1; k <= 100; k++) {
   //  sum = sum + k*c
      //   c = -c

        // sum = 0
        // for (k = 1; k <= 100; k++) {
          //   if (k % 2 ==0) {
             //    sum = sum - k
            // } else {
               //  sum = sum + k
        // }

// 1*(+1) + 2*(-1) + 3*(+1) + 4*(-1)