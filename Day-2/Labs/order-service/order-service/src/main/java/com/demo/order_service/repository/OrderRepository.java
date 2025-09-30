package com.demo.order_service.repository;

import com.demo.order_service.model.*;
import org.springframework.data.jpa.repository.*;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
