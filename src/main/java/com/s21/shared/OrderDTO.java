package com.s21.shared;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderDTO {
    private UUID orderID;
    private UUID userID;
    private String product;
    private int quantity;
    private OrderStatus status;

    public OrderDTO(){
        orderID=null;
        userID=null;
        product="";
        quantity=0;
        status=null;
    }

    @Default
    public OrderDTO(UUID orderID, UUID userID, String product, int quantity, OrderStatus status) {
        this.orderID = orderID;
        this.userID = userID;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }
}
