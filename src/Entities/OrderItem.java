package Entities;

public class OrderItem {

    private Integer quantity;
    private  Double price;
    private Product produto;

    //CONSTRUCT

    public OrderItem(){

    }

    public OrderItem(Integer quantity, Double price, Product produto) {
        this.quantity = quantity;
        this.price = price;
        this.produto = produto;
    }
    //SETS END GETS

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        return quantity * price;
    }









}
