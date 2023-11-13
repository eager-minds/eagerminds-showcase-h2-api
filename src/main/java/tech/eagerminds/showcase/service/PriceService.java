package tech.eagerminds.showcase.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.eagerminds.showcase.domain.dto.PriceDto;
import tech.eagerminds.showcase.repository.PriceRepository;

@Service
public class PriceService {

  PriceRepository priceRepository;

  @Autowired
  public PriceService(PriceRepository priceRepository) {
    this.priceRepository = priceRepository;
  }

  public PriceDto findTopWithProductIdAndBrandIdAndDateTime(int productId, int brandId,
      LocalDateTime dateTime) {
    var priceEntity = priceRepository.findTopWithProductIdAndBrandIdAndDateTime(productId, brandId,
        dateTime);
    if (priceEntity.isEmpty()) {
      return null;
    }
    var price = priceEntity.get();
    return new PriceDto(price.productId(), price.brandId(), price.priceList(), price.startDate(),
        price.endDate(), price.price());
  }
}
