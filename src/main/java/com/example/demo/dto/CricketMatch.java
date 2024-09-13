package com.example.demo.dto;

import com.example.demo.validator.ProperDates;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.StringJoiner;
import org.springframework.cglib.core.Local;

@ProperDates(message = "Start date cannot be later than end date!")
public class CricketMatch {

  @NotNull(message = "id can not be null")
  private String id;
  private LocalDateTime startDate;
  private LocalDateTime endDate;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", CricketMatch.class.getSimpleName() + "[", "]")
        .add("id='" + id + "'")
        .add("startDate=" + startDate)
        .add("endDate=" + endDate)
        .toString();
  }
}
