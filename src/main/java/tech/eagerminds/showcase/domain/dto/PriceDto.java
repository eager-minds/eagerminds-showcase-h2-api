package tech.eagerminds.showcase.domain.dto;

import java.time.LocalDateTime;

public record PriceDto(int productId, int brandId, int priceList, LocalDateTime startDate,
                       LocalDateTime endDate, double price) {

}