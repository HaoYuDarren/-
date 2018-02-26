package com.yh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author yuhao(yuhao1@xiaomi.com)
 * @create 2018-02-26-下午6:04
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}
