package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {

        //Creat process
        CheckoutProcess checkoutProcess = new CheckoutProcess();
        PaymentProcess paymentProcess = new PaymentProcess();

        //Create order
        Order order1 = new Order();

        //Test checkout
        checkoutProcess.process(order1);
        System.out.println(order1);

        //Test payment
        paymentProcess.process(order1);
        System.out.println(order1);

    }
}
