package com.account.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author gongsl
 */
@Data
@TableName("account_tbl")
public class Account implements Serializable {
    @TableId
    private Long id;
    private String userId;
    private Integer money;
}
