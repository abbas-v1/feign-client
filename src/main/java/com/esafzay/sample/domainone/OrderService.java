package com.esafzay.sample.domainone;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService {

    public List<OrderDto> getOrders() {
        return List.of(
                new OrderDto(3, BigDecimal.ONE, BigDecimal.TEN),
                new OrderDto(4, BigDecimal.ONE, BigDecimal.ZERO)
        );
    }
}
