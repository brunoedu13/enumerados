package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enum.OrderStatus;

public class Order {

    private Date moment;
    private OrderStatus status;
    private Client cliente;

    private List<OrderItem> orderItems = new ArrayList<>();

    //CONSTRUCT
    public Order(){

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.cliente = client;
    }


    //SETS END GETTERS


    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }


    //METHADS

    public void addItem(OrderItem pedido){
        this.orderItems.add(pedido);
    }

    public void removeItem(OrderItem pedido){
        this.orderItems.remove(pedido);
    }

    public Double total(){

        return 0.00;

    }



}

