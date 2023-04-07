package com.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author gongsl
 */
@Data
@TableName("order_tbl")
public class Order implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;
    //用户id
    private String userId;
    //商品编码
    private String commodityCode;
    //商品数量
    private Integer count;
    //商品金额
    private Integer money;
}
