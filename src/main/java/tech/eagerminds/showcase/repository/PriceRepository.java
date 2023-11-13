package tech.eagerminds.showcase.repository;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tech.eagerminds.showcase.domain.entity.PriceEntity;

public interface PriceRepository extends JpaRepository<PriceEntity, Integer> {

  @Query("select p from PriceEntity p where p.productId = :productId and p.brandId = :brandId"
      + " and p.startDate <= :dateTime and p.endDate >= :dateTime order by p.priority desc limit 1")
  Optional<PriceEntity> findTopWithProductIdAndBrandIdAndDateTime(@Param("productId") int productId,
      @Param("brandId") int brandId, @Param("dateTime") LocalDateTime dateTime);
}
