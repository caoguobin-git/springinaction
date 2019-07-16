/***********************************************
 * File Name: HomeController
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 15 07 2019 下午 4:09
 ***********************************************/

package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/","/homePage"})
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
