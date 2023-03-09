package com.youjia.web.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className CallReq
 * @date 2023/2/8 15:09
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CallReq {

    private String batchTransactionId;
    private String moduleName;
    private String moduleId;
    private Integer auditStatus;
    private String result;
    private String callbackUrlData;

}