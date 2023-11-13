package tech.eagerminds.showcase.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
public class PriceEntity {

  @Id
  int priceList;
  int brandId;
  LocalDateTime startDate;
  LocalDateTime endDate;
  int productId;
  int priority;
  double price;
  String curr;

  public PriceEntity() {
  }

  public PriceEntity(int priceList, int brandId, LocalDateTime startDate, LocalDateTime endDate,
      int productId, int priority, double price, String curr) {
    this.priceList = priceList;
    this.brandId = brandId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.productId = productId;
    this.priority = priority;
    this.price = price;
    this.curr = curr;
  }

  public int priceList() {
    return priceList;
  }

  public void setPriceList(int priceList) {
    this.priceList = priceList;
  }

  public int brandId() {
    return brandId;
  }

  public void setBrandId(int brandId) {
    this.brandId = brandId;
  }

  public LocalDateTime startDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public LocalDateTime endDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public int productId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public int priority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }

  public double price() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String curr() {
    return curr;
  }

  public void setCurr(String curr) {
    this.curr = curr;
  }
}
