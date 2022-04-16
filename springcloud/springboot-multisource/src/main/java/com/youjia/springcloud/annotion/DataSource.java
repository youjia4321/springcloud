package com.youjia.springcloud.annotion;

import java.lang.annotation.*;

/**
 * @Author: youjia
 * @Description: 多数据源标识
 * @ClassName: DataSource
 * @Create: 22/4/16 12:33
 * @Version: 1.0
 */

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DataSource {

    String name() default "";
}