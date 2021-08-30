package org.example;

import org.example.service.CashbackService;

public class Main {
  public static void main(String[] args) {
    final var service = new CashbackService();
    final var cashback = service.calculate(100);

    System.out.println(cashback);
  }
}
