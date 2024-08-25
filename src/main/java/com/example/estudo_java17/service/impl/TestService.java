package com.example.estudo_java17.service.impl;

import com.example.estudo_java17.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static com.example.estudo_java17.service.impl.RequestCounterFactory.configureRequestCounter;

@Service
public class TestService implements ITestService {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());
  private final IRequestCounter requestCounter;

  public TestService() {
    this.requestCounter = configureRequestCounter('A');
  }

  @Override
  public void test() {
    var count = requestCounter.count();
    logger.info("=================== >>> Processando requisição de número {}!!!", count);
  }
}
