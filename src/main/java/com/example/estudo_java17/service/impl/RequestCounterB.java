package com.example.estudo_java17.service.impl;

public final class RequestCounterB implements IRequestCounter {
  private int count = 0;

  @Override
  public int count() {
    return count += 10;
  }
}
