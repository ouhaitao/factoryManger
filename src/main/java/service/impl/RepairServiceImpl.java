package service.impl;

import org.springframework.stereotype.Service;
import po.RepairList;
import service.RepairService;

import java.util.List;
import java.util.Map;

@Service
public class RepairServiceImpl implements RepairService {
    @Override
    public boolean insertRepair(RepairList repairList) {
        return false;
    }

    @Override
    public boolean deleteRepair(Map<String, String> map) {
        return false;
    }

    @Override
    public List<RepairList> selectRepair(Map<String, String> m) {
        return null;
    }

    @Override
    public boolean updateRepair(RepairList rl) {
        return false;
    }
}
