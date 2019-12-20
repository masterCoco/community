package life.malu.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author BBB
 * @version 1.0
 * @date 2019/12/20 23:50
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name, Model model){
       model.addAttribute("name",name);
        return "hello";
    }
}
