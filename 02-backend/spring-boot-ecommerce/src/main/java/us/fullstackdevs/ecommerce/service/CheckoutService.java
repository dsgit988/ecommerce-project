package us.fullstackdevs.ecommerce.service;

import us.fullstackdevs.ecommerce.dto.Purchase;
import us.fullstackdevs.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
