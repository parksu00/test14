package com.kh.demo.dao;

import lombok.Data;

@Data
public class Product {
  private Long pid; //  PID	NUMBER(10,0)
  private String pname;   //  PNAME	VARCHAR2(30 BYTE)
  private Long count;  //  COUNT	NUMBER(10,0)
  private Long price;   //  PRICE	NUMBER(10,0)

}
