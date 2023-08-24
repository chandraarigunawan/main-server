package com.main.app.web.controller;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {
  private HelloController target = new HelloController();

  @Test
  public void testHello() {
    String hello = target.hello();
    assertThat(hello).isEqualTo("hello world API versi 2");
  }
}
