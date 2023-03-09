package com.youjia.springcloud.utils;

import com.youjia.springcloud.domain.SysOperLog;

import java.util.Date;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className SysOperUtil
 * @date 2023/3/9 15:54
 */
public class SysOperUtil {

    public static SysOperLog create() {
        return SysOperLog.builder()
                .title("菜单管理")
                .businessType(1)
                .method("com.ebupt.mms.admin.controller.system.SysMenuController.add()")
                .requestMethod("POST")
                .operatorType(1)
                .operName("admin")
                .deptName("研发部")
                .operUrl("/system/menu")
                .operIp("127.0.0.1")
                .operLocation("内网IP")
                .operParam("{\"visible\":\"0\",\"orderNum\":3,\"menuName\":\"短信任务编辑\",\"params\":{},\"parentId\":600,\"createBy\":\"admin\",\"children\":[],\"isFrame\":1,\"menuType\":\"F\",\"perms\":\"smsbatch:task:edit\",\"status\":\"0\"}")
                .jsonResult("{\"msg\":\"操作成功\",\"code\":200}")
                .status(0)
                .errorMsg("")
                .operTime(new Date())
                .build();
    }

}
