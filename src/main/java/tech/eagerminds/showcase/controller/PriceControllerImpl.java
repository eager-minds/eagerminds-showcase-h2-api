package tech.eagerminds.showcase.controller;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.eagerminds.showcase.domain.dto.PriceDto;
import tech.eagerminds.showcase.service.PriceService;

@RestController
@RequestMapping(path = "price")
public class PriceControllerImpl implements PriceController {

  PriceService priceService;

  @Autowired
  public PriceControllerImpl(PriceService priceService) {
    this.priceService = priceService;
  }

  @Override
  public ResponseEntity<PriceDto> find(LocalDateTime dateTime, Integer productId, Integer brandId) {
    var priceDto = priceService.findTopWithProductIdAndBrandIdAndDateTime(productId, brandId,
        dateTime);
    return new ResponseEntity<>(priceDto, HttpStatus.OK);
  }
}