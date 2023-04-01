package com.kob.acwingkob.controller.pk;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk/") //看起来就是外层的路径
class BotInfoController {

    @RequestMapping("getbotinfo/") //内层的路径
        public String getBotInfo(){ //这个函数名可以自定义
            return "hhh";
        }
        //端口可以在resources/application.properties 里面改
}
