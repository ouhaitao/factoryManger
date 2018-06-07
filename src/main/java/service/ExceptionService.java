package service;

import po.ExceptionList;

import java.util.List;
import java.util.Map;

public interface ExceptionService {

    /**
     * 新建一条异常报告信息
     * @param e
     * @return
     */
   boolean insertException(ExceptionList e);

    /**
     * 删除一条异常信息
     * @param id 异常报告id
     * @return
     */
   boolean deleteException(int id);

    /**
     * 查询异常报告信息列表
     * @param map 查询条件
     * @return
     */
   List<ExceptionList> selectException(Map<String,String> map);

    /**
     * 更新报告单信息
     * @param e
     * @return
     */
   boolean updateException(ExceptionList e);
}
