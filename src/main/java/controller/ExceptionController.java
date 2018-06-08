package controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import po.ExceptionList;
import po.RepairList;
import service.ExceptionService;
import service.RepairService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExceptionController {
    @Autowired
    ExceptionService exceptionService;
    @Autowired
    RepairService repairService;

    /**
     * 获取报修单
     * @param process 对应repairlist实体中的declare属性
     * @return
     */
    @GetMapping(value = "/department/{process}/repairlist")
    public String apiGetRepairlist(@PathVariable("process")String process){
        List<RepairList> list=null;
        Map<String,String> map=new HashMap<>();
        map.put("process",process);
        list=repairService.selectRepair(map);
        return JSON.toJSONString(list);
    }

    /**
     * 获取异常报告单
     * @param process 对应excptionlist实体中的declare属性
     * @return
     */
    @GetMapping(value = "/department/{process}/exceptionlist")
    public String apiGetExceptionlist(@PathVariable("process")String process){
        List<ExceptionList> list=null;
        Map<String,String> map=new HashMap<>();
        map.put("process",process);
        list=exceptionService.selectException(map);
        return JSON.toJSONString(list);
    }

    /**
     * 提交报修单
     * 提交报修单时记录报修单的同时也
     * 将该操作记录到当前部门订单（如果当前没有正在生产的订单则不用）的生产日志（prodeceLog）
     * 格式：日志类型：故障报修；内容：报修单的故障简介（summary），处理结果：提交报修
     * 将订单状态置为暂停生产（-2）
     * @param rl
     * @return 提交结果
     */
    @PostMapping(value = "/department/repairlist")
    public String apiAddRepairlist(@RequestBody RepairList rl){

        return "result";
    }


    /**
     * 提交异常报告单
     * 同上，也需要将该操作记录到生产日志，异常是针对订单的，因此不必判断是否订单生产中
     * 格式：日志类型：与异常报告单相同；内容：报告单简介；处理结果：提交报告
     * 根据stop属性判断是否将订单状态置为暂停，stop=0（不用暂停），stop=-1（暂停）
     * @param el
     * @return
     */
    @PostMapping(value = "/department/exceptionlist")
    public String apiAddExceptionlist(@RequestBody ExceptionList el){

        return "result";
    }

    /**
     * 提交报修单处理结果
     * 如果问题已解决，当前有订单暂停生产，并且当前部门没有其他暂停订单生产的异常，则将订单状态置为生产中（0）
     * 添加生产日志
     * 格式：日志类型：复产；内容：机械故障修复；
     * @param rid
     * @param map
     * @return
     */
    @PutMapping(value = "/repairlist/{rid}")
    public String apiUpdateRepair(@PathVariable("rid")String rid, @RequestBody Map<String,String> map){

        return "result";
    }

    /**
     * 提交异常报告处理结果
     * * 如果问题已解决，当前有订单暂停生产，并且当前部门没有其他暂停订单生产的异常，则将订单状态置为生产中（0）
     * 添加生产日志
     * 格式：日志类型：复产；内容：人事异常已排除；
     * @param eid
     * @param map
     * @return
     */
    @PutMapping(value = "/exceptionlist/{eid}")
    public String apiUpdateException(@PathVariable("eid")String eid,@RequestBody Map<String,String> map){

        return "result";
    }


}
