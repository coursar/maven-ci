package org.example.service;

public class CashbackService {
  public int calculate(int amount) {
    final int limit = 3_000_00;
    final int percent = 3;

    final int cashback = amount * percent / 100;
    return Math.min(cashback, limit);
  }
}
