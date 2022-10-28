package com.esafzay.sample.domainone;

import java.math.BigDecimal;

public record OrderDto(long orderId, BigDecimal amount, BigDecimal price) {
}
