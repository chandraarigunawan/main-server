package com.main.app.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MenuDetail {
  private long menuId;
  private long categoryId;
  private String menuName;
  private PriceInfo priceInfo;
  private MenuStatus status;
}
