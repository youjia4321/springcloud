package com.youjia.springcloud.controller;

import com.youjia.springcloud.pojo.RequestMessage;
import com.youjia.springcloud.pojo.ResponseMessage;
import com.youjia.springcloud.service.DBFresh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: youjia
 * @Description:
 * @ClassName: WsController
 * @Create: 22/4/15 12:31
 * @Version: 1.0
 */

@Controller
public class WsController {

    /**
     * say方法上添加的@MessageMapping注解和我们之前使用的@RequestMapping类似。
     * @SendTo 注解表示当服务器有消息需要推送的时候， 会对订阅了@SendTo中路径的浏览器发送消息。
     *
     * 除此之外，我还定义了一个定时推送消息方法，这个方法每隔1秒会主动给订阅了主题/topic/callback的客户端推送消息。
     */

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private DBFresh dbFresh;

    @MessageMapping("/welcome")
    @SendTo("/topic/say")
    public ResponseMessage say(RequestMessage message) {
        System.out.println(message.getName());
        return new ResponseMessage("welcome," + message.getName() + " !");
    }

    /**
     * 定时推消息
     */
    @Scheduled(fixedRate = 1000)
    public void callback() {
        // 发现消息
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Map<String, Object> resp = new HashMap<>(2);
        resp.put("msg", "定时推送消息时间: " + df.format(new Date()));
        resp.put("deptInfo", dbFresh.doGetDeptInfo());
        messagingTemplate.convertAndSend("/topic/callback", resp);
    }


}
