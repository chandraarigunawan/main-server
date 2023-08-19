package com.main.app.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class TableDetail {
  private long tableId;
  private String tableName;
  private int seatSize;
  private String description;
  private String memberId;
  private String memberName;
  private TableStatus status;
}
