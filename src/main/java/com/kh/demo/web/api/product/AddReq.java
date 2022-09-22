package com.kh.demo.web.api.product;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AddReq {
  @NotBlank
  private String pname;   //  PNAME	VARCHAR2(30 BYTE)
  @NotNull
  private Long count;  //  COUNT	NUMBER(10,0)
  @NotNull
  private Long price;   //  PRICE	NUMBER(10,0)
}
