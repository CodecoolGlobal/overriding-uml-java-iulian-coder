package com.codecool.uml.overriding;

public class Order implements Orderable {
    private int counter = 0;
    private int id;
    String status;

    public Order(){
        this.id = counter++;
        this.status = "new";
    }


    public String getStatus() {
        return this.status;
    }


    @Override
    public boolean checkout() {
        this.status = "checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "paid";
        return true;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
