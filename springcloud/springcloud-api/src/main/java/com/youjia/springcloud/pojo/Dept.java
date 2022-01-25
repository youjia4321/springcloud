package com.youjia.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: Dept
 * @Create: 22/1/25 21:40
 * @Version: 1.0
 */

@NoArgsConstructor
@Data
@Accessors(chain = true) // 链式写法 new Dept().setName().setDeptNo();
public class Dept implements Serializable {

    private Long deptNo;
    private String deptName;
    private String dbSource;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
