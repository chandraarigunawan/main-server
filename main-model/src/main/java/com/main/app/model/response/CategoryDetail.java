package com.main.app.model.response;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class CategoryDetail {
  private long categoryId;
  private String categoryName;
  private List<CategoryDetail> childrens;
}
