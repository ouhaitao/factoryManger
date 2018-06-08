package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import po.Admin;

@Controller
public class PagesController {

    @GetMapping(value = "/loginPage")
    public String loginPage(){return "login";}

    @GetMapping(value = "{process}/admin")
    public String pageConsole(){return "/console";}

    @RequestMapping(value = "/test")
    public String getTest(String id){
        Admin admin=new Admin();
        admin.setUsername(id);
//        model.addAttribute("admin",admin);
        return "/test";

    }

    @RequestMapping(value = "/test2")
    public String getTest2(String id){
        Admin admin=new Admin();
        admin.setUsername(id);
//        model.addAttribute("admin",admin);
        return "/test2";

    }

    @RequestMapping(value = "/console")
    public String getConsole(){return "/console";}

    @RequestMapping(value = "/material")
    public String getMaterial(Model model){
        model.addAttribute("item","原料管理");
        return "/order/material";}

    @RequestMapping(value = "/order")
    public String getOrder(Model model){
        model.addAttribute("item","生产中的订单");
        return "/order/order";}

    @RequestMapping(value = "/orders")
    public String getOrders(Model model){
        model.addAttribute("item","订单列表");
        return "/order/orders";}

    @RequestMapping(value = "/logs")
    public String getLogs(Model model){
        model.addAttribute("item","生产日志");
        return "/order/logs";}

        @RequestMapping(value = "/execute")
    public String getExecute(Model model){
        model.addAttribute("item","执行生产订单");
        return "/order/execute";
        }
    @RequestMapping(value = "/quality")
    public String getQuality(Model model){
        model.addAttribute("item","产品质检");
        return "/order/quality";
    }

    @RequestMapping(value = "/operator")
    public String getOperator(Model model){
        model.addAttribute("item","操作异常");
        return "/exception/operator";
    }

    @RequestMapping(value = "/hitch")
    public String getHitch(Model model){
        model.addAttribute("item","故障报修");
        return "/exception/hitch";
    }

    @RequestMapping(value = "/employee")
    public String getEmployee(Model model){
        model.addAttribute("item","人事变动");
        return "/exception/employee";
    }
}
