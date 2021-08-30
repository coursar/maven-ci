package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// @Test -> new CashbackServiceTest(); -> .shouldCalculate*
class CashbackServiceTest {
  @Test
  void shouldCalculateOverLimit() {
    // A-A-A
    // Arrange
    final var service = new CashbackService();
    final var amount = 100_00;
    final var expected = 5_00;

    // Act
    final var actual = service.calculate(amount);

    // Assert
    assertEquals(expected, actual);
  }
}