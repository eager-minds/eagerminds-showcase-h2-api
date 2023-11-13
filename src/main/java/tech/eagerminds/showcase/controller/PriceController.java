package tech.eagerminds.showcase.controller;

import java.time.LocalDateTime;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.eagerminds.showcase.domain.dto.PriceDto;

public interface PriceController {

  @GetMapping(path = "find", produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<PriceDto> find(@RequestParam LocalDateTime dateTime,
      @RequestParam Integer productId, @RequestParam Integer brandId);
}