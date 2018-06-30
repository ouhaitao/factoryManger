package service;

import po.ExceptionList;
import po.RepairList;

import java.util.List;
import java.util.Map;

public interface ExceptionService {


   String insertException(ExceptionList e);


   String deleteException(int id);


   List<ExceptionList> selectException(Map<String,String> map);


   String insertRepair(RepairList repairList);


   String deleteRepair(int id);


   List<RepairList> selectRepair(Map<String,String> m);


}
