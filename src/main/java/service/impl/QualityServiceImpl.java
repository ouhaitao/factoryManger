package service.impl;

import po.QualityReport;
import service.QualityService;

import java.util.List;
import java.util.Map;

public class QualityServiceImpl implements QualityService {
    @Override
    public boolean insertQuality(QualityReport qualityReport) {
        return false;
    }

    @Override
    public boolean deleteQuality(Map<String, String> map) {
        return false;
    }

    @Override
    public List<QualityReport> selectQuality(Map<String, String> map) {
        return null;
    }

    @Override
    public boolean updateQuality(QualityReport qr) {
        return false;
    }
}
