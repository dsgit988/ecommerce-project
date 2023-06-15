package us.fullstackdevs.ecommerce.dto;

import lombok.Data;
import us.fullstackdevs.ecommerce.entity.Address;
import us.fullstackdevs.ecommerce.entity.Customer;
import us.fullstackdevs.ecommerce.entity.Order;
import us.fullstackdevs.ecommerce.entity.OrderItem;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
