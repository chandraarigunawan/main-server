package com.main.app.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MemberBankInfo {
  private String bankAccountNumber;
  private String bankName;
}
