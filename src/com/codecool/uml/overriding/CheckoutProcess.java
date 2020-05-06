package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess {

    @Override
    protected void action(Orderable item) {
        System.out.println("Entering checkout process");
        item.checkout();
    }
}
