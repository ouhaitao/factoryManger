package service.impl;

import mapper.MaterialMapper;
import mapper.ProduceLogMapper;
import mapper.WarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import po.Material;
import po.ProduceLog;
import po.Warehouse;
import service.MaterialService;
import util.CustomFormatter;
import util.LogType;

import java.util.Date;
import java.util.Map;

@Service
public class MaterialServiceImpl implements MaterialService {
   @Autowired
    MaterialMapper materialMapper;
   @Autowired
    WarehouseMapper warehouseMapper;
   @Autowired
    ProduceLogMapper logMapper;



    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public String addMaterial(Map<String, String> map) {
        Integer mId=Integer.valueOf(map.get("mId"));
        Integer num=Integer.valueOf(map.get("num"));
        Integer oid=Integer.valueOf(map.get("oId"));
        Integer uid=Integer.valueOf(map.get("uid"));
        Integer process=Integer.valueOf(map.get("process"));
        Warehouse warehouse=warehouseMapper.selectByPrimaryKey(mId);

        if (num>warehouse.getStock()){
            warehouse.setStock(warehouse.getStock()+num+10000);
            warehouseMapper.updateByPrimaryKey(warehouse);
            return "库存不足，等待仓库采购后再执行补料操作";
        }

        //记录生产日志
        ProduceLog pl = new ProduceLog();
        pl.setProcess(process);
        pl.setoId(oid);
        pl.setuId(uid);
        pl.setDate(CustomFormatter.fomartterDateToString(CustomFormatter.baseFormat,new Date()));
        pl.setInformation("增加原料数量：" + num);
        pl.setType(LogType.MATERIAL);
        logMapper.insert(pl);

        Material material=materialMapper.selectByOrderId(oid,process);
        material.setReality(material.getReality()+num);
        String r=materialMapper.updateByPrimaryKeySelective(material)>0?"TRUE":"FAILED";
        return r;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public String deleteMaterial(Map<String, String> map) {
        Integer mId=Integer.valueOf(map.get("mId"));
        Integer num=Integer.valueOf(map.get("num"));
        Integer oid=Integer.valueOf(map.get("oId"));
        Integer uid=Integer.valueOf(map.get("uid"));
        Integer process=Integer.valueOf(map.get("process"));
        //记录生产日志
        ProduceLog pl = new ProduceLog();
        pl.setProcess(process);
        pl.setoId(oid);
        pl.setuId(uid);
        pl.setDate(CustomFormatter.fomartterDateToString(CustomFormatter.baseFormat,new Date()));
        pl.setInformation("退料：" + num);
        pl.setType(LogType.MATERIAL);
        logMapper.insert(pl);
        //更新仓库
        Warehouse warehouse=warehouseMapper.selectByPrimaryKey(mId);
        warehouse.setStock(warehouse.getStock()+num);
        warehouseMapper.updateByPrimaryKeySelective(warehouse);
        //更新原料
        Material material=materialMapper.selectByOrderId(oid,process);
        material.setReality(material.getReality()-num);
        String r=materialMapper.updateByPrimaryKeySelective(material)>0?"TRUE":"FAILED";
        return r;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public String scrapMaterial(Map<String, String> map) {
        Integer num=Integer.valueOf(map.get("num"));
        Integer oid=Integer.valueOf(map.get("oId"));
        Integer process=Integer.valueOf(map.get("process"));
        Integer uid=Integer.valueOf(map.get("uid"));
        //记录生产日志
        ProduceLog pl = new ProduceLog();
        pl.setProcess(process);
        pl.setoId(oid);
        pl.setuId(uid);
        pl.setDate(CustomFormatter.fomartterDateToString(CustomFormatter.baseFormat,new Date()));
        pl.setInformation("处理废料：" + num);
        pl.setType(LogType.MATERIAL);
        logMapper.insert(pl);

        Material material=materialMapper.selectByOrderId(oid,process);
        material.setScrap(material.getScrap()-num);
        String r=materialMapper.updateByPrimaryKeySelective(material)>0?"TRUE":"FAILED";
        return r;
    }

}
