package com.main.app.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PriceInfo {
  private Long defaultPriceRate;
  private Long customPriceRate;
}
