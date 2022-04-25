package org.EPsJ;

public class TravelTime {
    public static void main(String[] args) {
        var kilometerstoOffice = 100;
        double taxiKmh = 60;
        double timetoOffice = kilometerstoOffice / taxiKmh;
        System.out.println("Время, которое требуется добраться до офиса = " + timetoOffice + " часов");
        double eveningSlowDebuff = 0.15;
        double timetoHome = timetoOffice * eveningSlowDebuff + timetoOffice;
                System.out.println("Время, которое требуется чтобы добраться до дома = " + timetoHome + " часов");
    }
}
