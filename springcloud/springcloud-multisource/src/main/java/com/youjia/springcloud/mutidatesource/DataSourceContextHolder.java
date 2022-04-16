package com.youjia.springcloud.mutidatesource;

/**
 * @Author: youjia
 * @Description: datasource的上下文，用来存储当前线程的数据源类型
 * @ClassName: DataSourceContextHolder
 * @Create: 22/4/16 12:14
 * @Version: 1.0
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    /**
     * @param dataSourceType 数据库类型
     * @Description: 设置数据源类型
     */
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    /**
     * @Description: 获取数据源类型
     */
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    /**
     * @Description: 清除数据源类型
     */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

}
