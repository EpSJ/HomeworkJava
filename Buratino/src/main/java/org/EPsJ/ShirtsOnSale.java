package org.EPsJ;

public class ShirtsOnSale {
    public static void main(String[] args) {
        var costperShirt = 20;
        var shirtsInBasket = 10 ;
        var shirtsAmountForDiscount = 8;
        var remainedShirtsAmountForDiscount = shirtsAmountForDiscount - shirtsInBasket;
        System.out.println("Сколько ещё нужно рубашек для скидки = " + remainedShirtsAmountForDiscount);
        var costSumWithoutDiscount = costperShirt * shirtsInBasket;
        System.out.println("Цена всех рубашек без скидки = " + costSumWithoutDiscount);
        var remainedShirtsAmountForDiscountToBuy = remainedShirtsAmountForDiscount * costperShirt;
        System.out.println("Цена рубашек, которые нужно докупить, чтобы получить скидку = " + remainedShirtsAmountForDiscountToBuy);
        double discount = 0.15;
        double discountedOneShirt = costperShirt * discount;
        System.out.println("Сумма скидки на одну рубашку " + discountedOneShirt);
        double discountedCostForBasket = costSumWithoutDiscount - (discountedOneShirt * shirtsInBasket);
        System.out.println("Цена всех товаров в корзине со скидкой = " + discountedCostForBasket);
        double savedMoney = costSumWithoutDiscount * discount;
        System.out.println("Сэкономленные деньги = " + savedMoney);
        double freeShirts = savedMoney * shirtsInBasket / costSumWithoutDiscount;
        System.out.println("Рубашки за даром = " + freeShirts);
    }
}
