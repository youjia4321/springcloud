package com.youjia.springcloud.aop;

import com.youjia.springcloud.annotion.DataSource;
import com.youjia.springcloud.mutidatesource.DSEnum;
import com.youjia.springcloud.mutidatesource.DataSourceContextHolder;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: MultiSourceExAop
 * @Create: 22/4/16 12:39
 * @Version: 1.0
 */

@Aspect
@Component
@ConditionalOnProperty(prefix = "xncoding", name = "muti-datasource-open", havingValue = "true")
public class MultiSourceExAop implements Ordered {

    private Logger log = Logger.getLogger(this.getClass());

    @Pointcut(value = "@annotation(com.youjia.springcloud.annotion.DataSource)")
    private void cut() {

    }

    @Around("cut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Signature signature = point.getSignature();
        MethodSignature methodSignature;
        if (!(signature instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        methodSignature = (MethodSignature) signature;

        Object target = point.getTarget();
        Method currentMethod = target.getClass().getMethod(methodSignature.getName(), methodSignature.getParameterTypes());

        DataSource datasource = currentMethod.getAnnotation(DataSource.class);
        if (datasource != null) {
            DataSourceContextHolder.setDataSourceType(datasource.name());
            log.debug("设置数据源为：" + datasource.name());
        } else {
            DataSourceContextHolder.setDataSourceType(DSEnum.DATA_SOURCE_CORE);
            log.debug("设置数据源为：" + DSEnum.DATA_SOURCE_CORE);
        }
        try {
            return point.proceed();
        } finally {
            log.debug("清空数据源信息！");
            DataSourceContextHolder.clearDataSourceType();
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }

}
