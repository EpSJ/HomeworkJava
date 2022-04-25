package org.EPsJ;

public class StockOfBuckWheat {
    public static void main(String[] args) {
        int numberOfMonth = 10;
        int monthEaten = 6;
        int oneKgCost = 100;
        int buckwheatStock = numberOfMonth * monthEaten;
        int monthAllKgCost = buckwheatStock * oneKgCost;
        for (; buckwheatStock > 0; ) {
            buckwheatStock = buckwheatStock - monthEaten;
            monthAllKgCost=  monthAllKgCost + (buckwheatStock * oneKgCost);
        }
        System.out.println("Вот и кончилась твоя греча, Василий " + monthAllKgCost + " рублей ты потратил на её хранение");
    }
}



// склад = количество месяцев умноженное на столько, сколько в среднем ест Василий (check)
// за все месяцы оплата складывается из умножения склада на цену за хранение килограмма(check)
// в цикле нужно одно условие, для расчёта, сколько месяцев придётся платить, пока гречка не кончится(check) // спасибо гуглу за инфо
// чтобы это рассчитать нужно -> от склада отнять ежемесячный расход и после этого вычислить сумму расходов за все месяцы, пока гречка не кончится ->
// сумму за все месяцы приплюсовать к количеству оставшихся запасов умноженных на расходы за 1 месяц на хранение, пока мы не придём к сумме всех месяцем. (check)

