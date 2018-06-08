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
     * ��ȡ���޵�
     * @param process ��Ӧrepairlistʵ���е�declare����
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
     * ��ȡ�쳣���浥
     * @param process ��Ӧexcptionlistʵ���е�declare����
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
     * �ύ���޵�
     * �ύ���޵�ʱ��¼���޵���ͬʱҲ
     * ���ò�����¼����ǰ���Ŷ����������ǰû�����������Ķ������ã���������־��prodeceLog��
     * ��ʽ����־���ͣ����ϱ��ޣ����ݣ����޵��Ĺ��ϼ�飨summary�������������ύ����
     * ������״̬��Ϊ��ͣ������-2��
     * @param rl
     * @return �ύ���
     */
    @PostMapping(value = "/department/repairlist")
    public String apiAddRepairlist(@RequestBody RepairList rl){

        return "result";
    }


    /**
     * �ύ�쳣���浥
     * ͬ�ϣ�Ҳ��Ҫ���ò�����¼��������־���쳣����Զ����ģ���˲����ж��Ƿ񶩵�������
     * ��ʽ����־���ͣ����쳣���浥��ͬ�����ݣ����浥��飻���������ύ����
     * ����stop�����ж��Ƿ񽫶���״̬��Ϊ��ͣ��stop=0��������ͣ����stop=-1����ͣ��
     * @param el
     * @return
     */
    @PostMapping(value = "/department/exceptionlist")
    public String apiAddExceptionlist(@RequestBody ExceptionList el){

        return "result";
    }

    /**
     * �ύ���޵�������
     * ��������ѽ������ǰ�ж�����ͣ���������ҵ�ǰ����û��������ͣ�����������쳣���򽫶���״̬��Ϊ�����У�0��
     * ���������־
     * ��ʽ����־���ͣ����������ݣ���е�����޸���
     * @param rid
     * @param map
     * @return
     */
    @PutMapping(value = "/repairlist/{rid}")
    public String apiUpdateRepair(@PathVariable("rid")String rid, @RequestBody Map<String,String> map){

        return "result";
    }

    /**
     * �ύ�쳣���洦����
     * * ��������ѽ������ǰ�ж�����ͣ���������ҵ�ǰ����û��������ͣ�����������쳣���򽫶���״̬��Ϊ�����У�0��
     * ���������־
     * ��ʽ����־���ͣ����������ݣ������쳣���ų���
     * @param eid
     * @param map
     * @return
     */
    @PutMapping(value = "/exceptionlist/{eid}")
    public String apiUpdateException(@PathVariable("eid")String eid,@RequestBody Map<String,String> map){

        return "result";
    }


}
