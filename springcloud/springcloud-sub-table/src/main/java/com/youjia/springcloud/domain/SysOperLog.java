package com.youjia.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className User
 * @date 2023/3/9 14:14
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SysOperLog {

  private long operId;
  private String title;
  private long businessType;
  private String method;
  private String requestMethod;
  private long operatorType;
  private String operName;
  private String deptName;
  private String operUrl;
  private String operIp;
  private String operLocation;
  private String operParam;
  private String jsonResult;
  private long status;
  private String errorMsg;
  private Date operTime;

}
