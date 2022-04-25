package org.EPsJ;

public class Workers {
    public static void main(String[] args) {
        var devs = 6;
        System.out.println("Количество разработчиков на проекте = " + devs );
        var testers = 1;
        var sd = 2;
        var testersfor1Dev = devs * testers;
        System.out.println("Количество тестировщиков необходимое для проверки кода одного разработчика = " + testersfor1Dev );
        var sdforQuestions = sd * devs;
        System.out.println("Rоличество специалистов поддержки для обработки вопросов пользователей по поводу кода, написанного одним программистом = " + sdforQuestions);
        var fullState = devs + testersfor1Dev + sdforQuestions;
        System.out.println("Количество сотрудников на проекте = " + fullState);
    }
}
