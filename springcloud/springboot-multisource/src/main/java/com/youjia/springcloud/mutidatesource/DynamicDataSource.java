package com.youjia.springcloud.mutidatesource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: youjia
 * @Description: 动态数据源
 * @ClassName: DynamicDataSource
 * @Create: 22/4/16 12:32
 * @Version: 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSourceType();
    }

}