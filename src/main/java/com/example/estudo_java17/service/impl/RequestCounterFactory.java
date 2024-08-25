package com.example.estudo_java17.service.impl;

public class RequestCounterFactory {
  public static IRequestCounter configureRequestCounter(char counterType) {
    if (counterType == 'A' || counterType == 'a') {
      return new RequestCounterA();
    } else if (counterType == 'B' || counterType == 'b') {
      return new RequestCounterB();
    }
    throw new IllegalArgumentException("Invalid counter type: %s".formatted(counterType));
  }
}
