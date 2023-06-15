package us.fullstackdevs.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import us.fullstackdevs.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
