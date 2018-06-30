package controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import po.ExceptionList;
import po.RepairList;
import service.ExceptionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExceptionController {
    @Autowired
    ExceptionService exceptionService;

    @GetMapping(value = "/department/{process}/repairlist")
    public String apiGetRepairlist(@PathVariable("process")String process){
        List<RepairList> list=null;
        Map<String,String> map=new HashMap<>();
        map.put("process",process);
        list=exceptionService.selectRepair(map);
        return JSON.toJSONString(list);
    }


    @GetMapping(value = "/department/{process}/exceptionlist")
    public String apiGetExceptionlist(@PathVariable("process")String process){
        List<ExceptionList> list=null;
        Map<String,String> map=new HashMap<>();
        map.put("process",process);
        list=exceptionService.selectException(map);
        return JSON.toJSONString(list);
    }

    @PostMapping(value = "/department/repairlist")
    public String apiAddRepairlist(@RequestBody RepairList rl){
        return exceptionService.insertRepair(rl);
    }



    @PostMapping(value = "/department/exceptionlist")
    public String apiAddExceptionlist(@RequestBody ExceptionList el){
        return exceptionService.insertException(el);
    }



}
