package com.example.estudo_java17.service.impl;

public sealed interface IRequestCounter permits RequestCounterA, RequestCounterB {
  int count();
}
