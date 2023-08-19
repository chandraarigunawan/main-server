package com.main.app.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MemberDetail {
  private long memberId;
  private String memberNo;
  private String memberName;
  private String memberTypeName;
  private String gender;
  private MemberBankInfo bankInfo;
  private String identityIdNumber;
  private String identityIdUrl;
  private Long birthDate;
  private String phoneNumber;
  private MemberStatus status;
  private Long startValidDate;
  private Long expiryValidDate;
  private Long lastOrderTime;
  private Long lastOrderAmount;
  private String travelAgent;
  private Long balance;
  private double discountPercentage;
  private double comissionPercentage;
}
