package com.kh.demo.web.api.product;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class EditReq {
  @NotBlank
  private String pname;   //  PNAME	VARCHAR2(30 BYTE)
  @NotNull
  @Positive(message="단가는 양수값만 가능합니다.")
  private Long count;  //  COUNT	NUMBER(10,0)
  @NotNull
  @Positive(message="단가는 양수값만 가능합니다.")
  private Long price;   //  PRICE	NUMBER(10,0)
}
