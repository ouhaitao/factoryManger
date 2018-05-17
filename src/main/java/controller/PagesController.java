package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping(value = "/loginPage")
    public String loginPage(){return "login";}

    @GetMapping(value = "{process}/admin")
    public String pageConsole(){return "/console";}
}
