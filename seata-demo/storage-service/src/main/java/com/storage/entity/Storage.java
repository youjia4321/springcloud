package com.storage.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author gongsl
 */
@Data
@TableName("storage_tbl")
public class Storage implements Serializable {
    @TableId
    private Long id;
    //商品编码
    private String commodityCode;
    //商品数量
    private Integer count;
}
