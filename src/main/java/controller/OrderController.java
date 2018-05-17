package controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.*;
import po.Order;
import po.ProduceLog;
import po.Rate;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class OrderController {

    /**
     * 获取该流程下等待处理的订单
     * @param process 当前流程
     * @return
     */
    @GetMapping(value = "/department/{process}/waitlist")
    public String apiGetWaitOrderList(@PathVariable("process") int process){
        List<Order> list=null;

        return JSON.toJSONString(list);
    }

    /**
     * 获取ordermodel信息，由于每个部门只能同时生产一个订单
     * 因此通过process以及state！=-1这两个条件
     * 来确定当前部门正在生产的订单
     * @param process 订单所处流程，也对应每一个流程部门
     * @return ordermodel
     */
    @GetMapping(value="/department/{process}/ordermodel")
    public String apiGetOrderModel(@PathVariable("process") int process){

        return JSON.toJSONString("");
    }

    /**
     * 获取生产日志
     * @param oid 订单id
     * @param process 流程
     * @return
     */
    @GetMapping(value = "/order/{oid}/department/{process}producelog")
    public String apiGetProduceLog(@PathVariable ("oid") String oid,@PathVariable("process") String process){
        List<ProduceLog> list=null;


        return JSON.toJSONString(list);
    }

    /**
     * 获取最近七天该部门的生产记录
     * @param process
     * @return
     */
    @GetMapping(value = "/department/{process}/rate")
    public String apiGetProduceRate(@PathVariable("process")String process){
        List<Rate> list=null;

        return JSON.toJSONString(list);
    }

    /**
     * 修改订单状态
     * 并添加生产日志
     * @param id 订单
     * @param process 当前流程
     * @param map {"operate":"要进行的操作",""}
     * @return 操作结果
     */
    @PutMapping(value = "/order/{oid}/department/{process}/state")
    public String apiUpdateOrder(@PathVariable("oid")String id,@PathVariable("process")String process,@RequestBody Map<String,String> map){
            String k=map.get("operate");
            switch (k){
                case "produce":
                    //订单投入生产（当前部门没有正在生产的订单才能生产新的订单）

                    break;
                case "quality":
                    //申请质检操作(必须生产进度100%的才能质检)

                    break;
                case "store":
                    //商品入库（必须质检合格的订单才能入库）
                    break;

                case "reproduce":
                    //质检不合格重新开始生产

                    break;

            }
        return "";
    }

    /**
     * 对原料进行加料、退料以及废料处理
     * @param id
     * @param process 当前流程
     * @param map {"operate":"要进行的操作","num":"数量"}
     * @return 操作是否成功
     */
    @PutMapping(value = "/order/{oid}/department/{process}/material")
    public String apiUpdateMaterial(@PathVariable("oid")String id,@PathVariable("process")String process, @RequestBody Map<String,String> map){
        String k=map.get("operate");
        switch (k){
            case "add":
                //添加原料
                break;

            case "remove":
                //退料操作
                break;

            case "scrap":
                //处理废料
                break;
        }
        return "result";
    }

    /**
     * 提交生产进度
     * 记录到rate表，同时记录到produceLog
     * 类型为"进度提交"，内容为“生产产品num”,处理结果不管
      * @param id 订单id
     * @param process 流程
     * @param map {"date":"时间","num","生产数量"}
     * @return
     */
    @PostMapping(value = "/order/{oid}/department/{process}/rate")
    public String apiAddProduceLog(@PathVariable("oid")String id,@PathVariable("process")String process,@RequestBody Map<String,String> map){


        return "result";
    }


}